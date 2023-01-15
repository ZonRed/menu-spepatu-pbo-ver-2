package ViewGui;

import controller.AdminController;
import model.AdminModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel PanelMain;
    private JTextField TextFieldUssername;
    private JPasswordField passwordField;
    private JButton ButtonLogin;
    private JButton ButtonExit;
    private JLabel LOGINLabel;

    JLabel userLabel;
    JLabel passLabel;
    AdminController admin = new AdminController();

    public LoginGUI() {
        setTitle("login");
        setSize(400, 300);
        setLayout(null);
        setResizable(false);
        createUIComponents();
    }

    private void createUIComponents() {
        PanelMain = new JPanel();
        LOGINLabel = new JLabel("LOGIN TOKO SEPATU KYONI");
        LOGINLabel.setBounds(145, 20, 200, 30);
        userLabel = new JLabel("ussername");
        userLabel.setBounds(50, 60, 200, 30);
        passLabel = new JLabel("password");
        passLabel.setBounds(50, 110, 200, 30);


        TextFieldUssername = new JTextField();
        TextFieldUssername.setBounds(120, 60, 200, 30);
        passwordField = new JPasswordField();
        passwordField.setBounds(120, 110, 200, 30);
        ButtonLogin = new JButton("Login");
        ButtonLogin.setBounds(140, 180, 100, 30);
        ButtonExit = new JButton("Exit");
        ButtonExit.setBounds(140, 220, 100, 30);

        add(PanelMain);
        add(LOGINLabel);
        add(userLabel);
        add(passLabel);
        add(TextFieldUssername);
        add(passwordField);
        add(ButtonLogin);
        add(ButtonExit);

        ButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        {
        }
        ButtonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userValue = TextFieldUssername.getText();
                String passValue = passwordField.getText();

                boolean status = admin.cari(userValue, passValue);
                if (status) {
                    MenuSepatuGui M = new MenuSepatuGui();
                    M.setVisible(true);
                    dispose();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    JOptionPane.showMessageDialog(null,"Username Atau Password Salah",
                            "login gagal",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


    public static void main(String[] args){
        LoginGUI l = new LoginGUI();
        AdminModel.dataAdmin();
        l.setVisible(true);
    }
}


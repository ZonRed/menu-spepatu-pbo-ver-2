package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.AdminController;
import entity.AdminEntity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends Frame{
    private AdminController admin = new AdminController();
    private JLabel perpusLabel,loginLabel,idLabel, passwordLabel;
    private JTextField idField;
    private JPasswordField passwordField;
    private JButton loginBtn;
    private JButton ExitBtn;

    public AdminLogin() {
        super("LOGIN", 400, 600);
    }

    @Override
    protected void component() {

        perpusLabel = new JLabel("TOKO SEPATU");
        perpusLabel.setFont(new Font("Arial", Font.BOLD, 24));
        perpusLabel.setForeground(color("#2596be"));
        boundedAdd(perpusLabel, 110, 265, 200, 45);

        loginLabel = new JLabel("LOGIN ADMIN");
        loginLabel.setFont(new Font("Arial", Font.BOLD, 20));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        boundedAdd(loginLabel, 95, 300, 200, 30);

        idLabel = new JLabel("ID");
        idLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(idLabel, 65, 350, 100, 18);

        idField = new JTextField();
        boundedAdd(idField, 65, 370, 270, 30);

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(passwordLabel, 65, 415, 65, 18);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 65, 435, 270, 30);

        loginBtn = new JButton("Masuk");
        loginBtn.setForeground(Color.white);
        loginBtn.setBackground(color("#2596be"));
        loginBtn.setFocusPainted(false);
        boundedAdd(loginBtn, 157, 485, 85, 30);

        ExitBtn = new JButton("Exit");
        ExitBtn.setForeground(Color.white);
        ExitBtn.setBackground(color("#2596be"));
        ExitBtn.setFocusPainted(false);
        boundedAdd(ExitBtn, 157, 535, 85, 30);

    }

    @Override
    protected void event() {
        ExitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        loginBtn.addActionListener((e) -> {
            int id = Integer.parseInt(idField.getText());
            String password = String.valueOf(passwordField.getPassword());
            AdminEntity objekAdmin = admin.cari(id, password);
            if (objekAdmin!=null) {
                JOptionPane.showMessageDialog(null, "Hallo " + objekAdmin.getNama(), "Login Sukses",
                JOptionPane.INFORMATION_MESSAGE);
                new MenuGuiView().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "ID atau Password Salah", "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}

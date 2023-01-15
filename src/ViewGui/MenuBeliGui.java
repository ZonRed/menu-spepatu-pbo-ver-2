package ViewGui;

import controller.AdminController;
import model.AdminModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBeliGui extends JFrame {
        private JPanel PanelMain;
        private JTextField TextFieldUssername;
        private JTextField TextFieldNamaPembeli;
        private JButton ButtonLogin;
        private JButton ButtonExit;
        private JLabel LOGINLabel;

        JLabel userLabel;
        JLabel passLabel;
        AdminController admin = new AdminController();

        public MenuBeliGui() {
            setTitle("Menu Beli");
            setSize(500, 500);
            setLayout(null);
            setResizable(false);
            createUIComponents();
        }

        private void createUIComponents() {
            PanelMain = new JPanel();
            LOGINLabel = new JLabel("MENU BELI SEPATU");
            LOGINLabel.setBounds(145, 20, 200, 30);
            userLabel = new JLabel("Masukkan Id Pembeli");
            userLabel.setBounds(50, 60, 200, 30);
            passLabel = new JLabel("Masukkan Atas Nama Pembeli");
            passLabel.setBounds(50, 110, 200, 30);


            TextFieldUssername = new JTextField();
            TextFieldUssername.setBounds(230, 60, 200, 30);
            TextFieldNamaPembeli = new JTextField();
            TextFieldNamaPembeli.setBounds(230, 110, 200, 30);
            ButtonLogin = new JButton("Login");
            ButtonLogin.setBounds(140, 180, 100, 30);
            ButtonExit = new JButton("Exit");
            ButtonExit.setBounds(140, 220, 100, 30);

            add(PanelMain);
            add(LOGINLabel);
            add(userLabel);
            add(passLabel);
            add(TextFieldUssername);
            add(TextFieldNamaPembeli);
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
        }


        public static void main(String[] args){
            ViewGui.MenuBeliGui mb = new ViewGui.MenuBeliGui();
            mb.setVisible(true);
        }
}




package ViewGui;

import controller.AdminController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuHapusGui extends JFrame {
        private JPanel PanelMain;
        private JTextField TextFieldUssername;
        private JButton ButtonBackToMenu;
        private JLabel MenuBeliLabel;
        JLabel userLabel;
        JLabel BarangHapusLabel;

        AdminController admin = new AdminController();

        public MenuHapusGui() {
            setTitle("Menu Beli");
            setSize(500, 500);
            setLayout(null);
            setResizable(false);
            createUIComponents();
        }

        private void createUIComponents() {
            PanelMain = new JPanel();
            MenuBeliLabel = new JLabel("MENU HAPUS PEMBELIAN");
            MenuBeliLabel.setBounds(145, 20, 200, 30);
            userLabel = new JLabel("Masukkan Nama Yang Di Hapus");
            userLabel.setBounds(50, 60, 200, 30);
            BarangHapusLabel = new JLabel("Barang Yang di Hapus =");
            BarangHapusLabel.setBounds(50, 110, 200, 30);

            TextFieldUssername = new JTextField();
            TextFieldUssername.setBounds(230, 60, 200, 30);

            ButtonBackToMenu = new JButton("Back To Menu");
            ButtonBackToMenu.setBounds(140, 160, 200, 30);

            add(PanelMain);
            add(MenuBeliLabel);
            add(userLabel);
            add(BarangHapusLabel);
            add(TextFieldUssername);
            add(ButtonBackToMenu);

            ButtonBackToMenu.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MenuSepatuGui ms = new MenuSepatuGui();
                    ms.setVisible(true);
                    dispose();
                }
            });
        }


        public static void main(String[] args){
            ViewGui.MenuHapusGui mh = new ViewGui.MenuHapusGui();
            mh.setVisible(true);
        }
}



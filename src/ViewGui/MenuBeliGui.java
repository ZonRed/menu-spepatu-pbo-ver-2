package ViewGui;

import controller.AdminController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBeliGui extends JFrame {
        private JPanel PanelMain;
        private JTextField TextFieldUssername;
        private JTextField TextFieldNamaPembeli;
        private JTextField TextFieldAlamat;
        private JTextField TextFieldMasukJenis;
        private JTextField TextFieldPilihanYN;
        private JTextField TextFieldJumlahBeli;
        private JButton ButtonBackToMenu;
        private JLabel MenuBeliLabel;
        JLabel userLabel;
        JLabel NamaPmebeliLabel;
        JLabel AlamatLabel;
        JLabel MasukJenisLabel;
        JLabel PilihanYNLabel;
        JLabel JumlahBeliLabel;

    AdminController admin = new AdminController();

        public MenuBeliGui() {
            setTitle("Menu Beli");
            setSize(500, 800);
            setLayout(null);
            setResizable(false);
            createUIComponents();
        }

        private void createUIComponents() {
            PanelMain = new JPanel();
            MenuBeliLabel = new JLabel("MENU BELI SEPATU");
            MenuBeliLabel.setBounds(145, 20, 200, 30);
            userLabel = new JLabel("Masukkan Id Pembeli");
            userLabel.setBounds(50, 60, 200, 30);
            NamaPmebeliLabel = new JLabel("Masukkan Atas Nama Pembeli");
            NamaPmebeliLabel.setBounds(50, 110, 200, 30);
            AlamatLabel = new JLabel("Masukkan Alamat Pembeli");
            AlamatLabel.setBounds(50, 160, 200, 30);
            MasukJenisLabel = new JLabel("Masukkan Jenis Sepatu");
            MasukJenisLabel.setBounds(50, 210, 200, 30);
            PilihanYNLabel = new JLabel("Pilih Sepatu Ini?(Y/N)");
            PilihanYNLabel.setBounds(50, 260, 200, 30);
            JumlahBeliLabel = new JLabel("Masukkan Jumlah Yang Dibeli");
            JumlahBeliLabel.setBounds(50, 310, 200, 30);


            TextFieldUssername = new JTextField();
            TextFieldUssername.setBounds(230, 60, 200, 30);
            TextFieldNamaPembeli = new JTextField();
            TextFieldNamaPembeli.setBounds(230, 110, 200, 30);
            TextFieldAlamat = new JTextField();
            TextFieldAlamat.setBounds(230, 160, 200, 30);
            TextFieldMasukJenis = new JTextField();
            TextFieldMasukJenis.setBounds(230, 210, 200, 30);
            TextFieldPilihanYN = new JTextField();
            TextFieldPilihanYN.setBounds(230, 260, 200, 30);
            TextFieldJumlahBeli = new JTextField();
            TextFieldJumlahBeli.setBounds(230, 310, 200, 30);



            
            ButtonBackToMenu = new JButton("Back To Menu");
            ButtonBackToMenu.setBounds(140, 460, 200, 30);

            add(PanelMain);
            add(MenuBeliLabel);
            add(userLabel);
            add(NamaPmebeliLabel);
            add(AlamatLabel);
            add(MasukJenisLabel);
            add(PilihanYNLabel);
            add(JumlahBeliLabel);
            add(TextFieldUssername);
            add(TextFieldNamaPembeli);
            add(TextFieldAlamat);
            add(TextFieldMasukJenis);
            add(TextFieldPilihanYN);
            add(TextFieldJumlahBeli);
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
            ViewGui.MenuBeliGui mb = new ViewGui.MenuBeliGui();
            mb.setVisible(true);
        }
}




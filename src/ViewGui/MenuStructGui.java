package ViewGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuStructGui extends JFrame {
    private JPanel PanelMain;
    private JLabel ISI1Label;
    private JLabel ISI2Label;
    private JLabel ISI3Label;
    private JLabel ISI4Label;
    private JLabel ISI5Label;
    private JLabel ISI6Label;
    private JButton ButtonBackToMenu;


    public MenuStructGui() {
        setTitle("Menu struct");
        setSize(500, 500);
        setLayout(null);

        createUIComponents();
    }


    private void createUIComponents() {
        PanelMain = new JPanel();
        JLabel STRUCTLabel = new JLabel("Struct");
        STRUCTLabel.setBounds(160, 20, 200, 30);
        ISI1Label = new JLabel("Nama Pembeli               = ");
        ISI1Label.setBounds(75, 60, 200, 30);
        ISI2Label = new JLabel("Alamat Pembeli             =");
        ISI2Label.setBounds(75, 100, 200, 30);
        ISI3Label = new JLabel("Jenis Sepatu yang dibeli  =");
        ISI3Label.setBounds(75, 140, 200, 30);
        ISI4Label = new JLabel("Ukuran Sepatu yang dibeli  =");
        ISI4Label.setBounds(75, 180, 200, 30);
        ISI5Label = new JLabel("Bahan Sepatu yang dibeli   =");
        ISI5Label.setBounds(75, 220, 200, 30);
        ISI6Label = new JLabel("Total Harga                =");
        ISI6Label.setBounds(75, 260, 200, 30);

        ButtonBackToMenu = new JButton("Back To Menu");
        ButtonBackToMenu.setBounds(140, 320, 200, 30);

        add(PanelMain);
        add(STRUCTLabel);
        add(ISI1Label);
        add(ISI2Label);
        add(ISI3Label);
        add(ISI4Label);
        add(ISI5Label);
        add(ISI6Label);
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


    public static void main(String[] args) {
        MenuStructGui s = new MenuStructGui();
        s.setVisible(true);
    }
}

package ViewGui;

import javax.swing.*;
public class MenuStruct extends JFrame {
    private JPanel PanelMain;
    private JLabel ISI1Label;
    private JLabel ISI2Label;
    private JLabel ISI3Label;
    private JLabel ISI4Label;
    private JLabel ISI5Label;
    private JLabel ISI6Label;


    public MenuStruct() {
        setTitle("coba");
        setSize(1000, 500);
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
        ISI6Label.setBounds(75, 240, 200, 30);

        add(PanelMain);
        add(STRUCTLabel);
        add(ISI1Label);
        add(ISI2Label);
        add(ISI3Label);
        add(ISI4Label);
        add(ISI5Label);
        add(ISI6Label);

    }

    public static void main(String[] args) {
        MenuStruct s = new MenuStruct();
        s.setVisible(true);
    }
}

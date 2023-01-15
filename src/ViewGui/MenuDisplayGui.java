package ViewGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDisplayGui extends JFrame {
    private JPanel PanelMain;
    private JLabel DisplayLabel;
    private JLabel Garis1Label,Garis2Label,Garis3Label;
    private JLabel ISI1Label,ISI2Label,ISI3Label,ISI4Label;
    private JLabel ISI5Label,ISI6Label,ISI7Label,ISI8Label;
    private JButton ButtonExit;



    public MenuDisplayGui() {
        setTitle("Menu Display");
        setSize(550, 500);
        setLayout(null);
        setResizable(false);

        createUIComponents();
    }


    private void createUIComponents() {
        PanelMain = new JPanel();
        DisplayLabel = new JLabel ("Display");
        DisplayLabel.setBounds(240, 20, 200, 30);
        Garis1Label = new JLabel("=======================================================");
        Garis1Label.setBounds(75, 50, 400, 30);
        ISI1Label = new JLabel("Jenis Sepatu  = || sneakers1 || sneakers2 || sneakers3 ||");
        ISI1Label.setBounds(75, 60, 400, 30);
        ISI2Label = new JLabel("Ukuran Sepatu = || 43 || 44 || 45 ||");
        ISI2Label.setBounds(75, 100, 200, 30);
        ISI3Label = new JLabel("Bahan Sepatu  = kulit sapi");
        ISI3Label.setBounds(75, 140, 200, 30);
        ISI4Label = new JLabel("Harga Sepatu  = || 400000 || 450000 || 500000 ||");
        ISI4Label.setBounds(75, 180, 400, 30);
        Garis2Label = new JLabel("=======================================================");
        Garis2Label.setBounds(75, 190, 400, 30);
        ISI5Label = new JLabel("Jenis Sepatu  = || sport1 || sport2 || sport3 ||");
        ISI5Label.setBounds(75, 210, 400, 30);
        ISI6Label = new JLabel("Ukuran Sepatu = || 43 || 44 || 45 ||");
        ISI6Label.setBounds(75, 250, 200, 30);
        ISI7Label = new JLabel("Bahan Sepatu  = kulit sapi");
        ISI7Label.setBounds(75, 285, 200, 30);
        ISI8Label = new JLabel("Harga Sepatu  = || 600000 || 650000 || 700000 ||");
        ISI8Label.setBounds(75, 320, 400, 30);
        Garis3Label = new JLabel("=======================================================");
        Garis3Label.setBounds(75, 340, 400, 30);


        ButtonExit = new JButton("Back To Menu");
        ButtonExit.setBounds(140, 380, 150, 30);

        add(PanelMain);
        add(DisplayLabel);
        add(Garis1Label);
        add(Garis2Label);
        add(Garis3Label);
        add(ISI1Label);
        add(ISI2Label);
        add(ISI3Label);
        add(ISI4Label);
        add(ISI5Label);
        add(ISI6Label);
        add(ISI7Label);
        add(ISI8Label);
        add(ButtonExit);

        ButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuSepatuGui ms = new MenuSepatuGui();
                ms.setVisible(true);
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        MenuDisplayGui d = new MenuDisplayGui();
        d.setVisible(true);
    }
}

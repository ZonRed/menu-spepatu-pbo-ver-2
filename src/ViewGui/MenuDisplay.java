package ViewGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDisplay extends JFrame {
    private JPanel PanelMain;
    private JLabel DisplayLabel;
    private JLabel ISI1Label;
    private JLabel ISI2Label;
    private JLabel ISI3Label;
    private JLabel ISI4Label;
    private JButton ButtonExit;



    public  MenuDisplay() {
        setTitle("coba");
        setSize(1000, 500);
        setLayout(null);

        createUIComponents();
    }


    private void createUIComponents() {
        PanelMain = new JPanel();
        DisplayLabel = new JLabel ("Display");
        DisplayLabel.setBounds(160, 20, 200, 30);
        ISI1Label = new JLabel("Jenis Sepatu  = ");
        ISI1Label.setBounds(75, 60, 200, 30);
        ISI2Label = new JLabel("Ukuran Sepatu = ");
        ISI2Label.setBounds(75, 100, 200, 30);
        ISI3Label = new JLabel("Bahan Sepatu  = ");
        ISI3Label.setBounds(75, 140, 200, 30);
        ISI4Label = new JLabel("Harga Sepatu  = ");
        ISI4Label.setBounds(75, 180, 200, 30);

        ButtonExit = new JButton("Back To Menu");
        ButtonExit.setBounds(140, 220, 150, 30);

        add(PanelMain);
        add(DisplayLabel);
        add(ISI1Label);
        add(ISI2Label);
        add(ISI3Label);
        add(ISI4Label);
        add(ButtonExit);

        ButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuSepatu ms = new MenuSepatu();
                ms.setVisible(true);
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        MenuDisplay d = new MenuDisplay();
        d.setVisible(true);
    }
}

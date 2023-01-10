package ViewGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSepatu extends JFrame {
    private JPanel PanelMain;
    private JLabel MenuLabel;
    private JButton ButtonDisplay;
    private JButton ButtonBeli;
    private JButton ButtonStruct;
    private JButton ButtonClear;
    private JButton ButtonBackLogin;


    public MenuSepatu() {
        setTitle("coba");
        setSize(350, 300);
        setLayout(null);

        createUIComponents();
    }


    private void createUIComponents() {
        PanelMain = new JPanel();
        MenuLabel = new JLabel ("MENU");
        MenuLabel.setBounds(160, 20, 200, 30);
        ButtonDisplay = new JButton("Display Sepatu");
        ButtonDisplay.setBounds(75, 60, 200, 30);
        ButtonBeli = new JButton("Beli");
        ButtonBeli.setBounds(75, 100, 200, 30);
        ButtonStruct = new JButton("Struct Pembelian");
        ButtonStruct.setBounds(75, 140, 200, 30);
        ButtonClear = new JButton("Clear Pembelian");
        ButtonClear.setBounds(75, 180, 200, 30);
        ButtonBackLogin = new JButton("Back To Login");
        ButtonBackLogin.setBounds(75, 180, 200, 30);


        add(PanelMain);
        add(MenuLabel);
        add(ButtonDisplay);
        add(ButtonBeli);
        add(ButtonStruct);
        add(ButtonBackLogin);

        ButtonBackLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginGUI l = new LoginGUI();
                l.setVisible(true);
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        MenuSepatu ms = new MenuSepatu();
        ms.setVisible(true);
    }
}

package view;

import model.AdminModel;

import javax.swing.JButton;
import java.awt.Color;

public class MenuGuiView extends Frame{
    
    private JButton beliButton,displayButton,BackToLoginButton;

    public MenuGuiView() {
        super("MENU", 400, 600);
    }

    @Override
    protected void component() {
        beliButton = new JButton("Beli");
        beliButton.setForeground(Color.white);
        beliButton.setBackground(color("#2596be"));
        beliButton.setFocusPainted(false);
        boundedAdd(beliButton, 100, 220, 200, 30);

        displayButton = new JButton("DISPLAY DETAIL TRANSAKSI");
        displayButton.setForeground(Color.white);
        displayButton.setBackground(color("#2596be"));
        displayButton.setFocusPainted(false);
        boundedAdd(displayButton, 100, 270,200, 30);

        BackToLoginButton = new JButton("BACK TO LOGIN");
        BackToLoginButton.setForeground(Color.white);
        BackToLoginButton.setBackground(color("#2596be"));
        BackToLoginButton.setFocusPainted(false);
        boundedAdd(BackToLoginButton, 100, 320,200, 30);

    }

    @Override
    protected void event() {
        beliButton.addActionListener((e) -> {
            dispose();
            new BeliView().setVisible(true);
        });
        displayButton.addActionListener((e)->{
            dispose();
            new Display().setVisible(true);
        });
        BackToLoginButton.addActionListener((e)->{
            AdminLogin al = new AdminLogin();
            al.setVisible(true);
            dispose();
        });

    }
}
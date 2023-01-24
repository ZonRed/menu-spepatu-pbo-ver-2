package view;

import controller.DetailTransaksiController;
import model.AdminModel;

import javax.swing.*;
import java.awt.Color;

public class MenuGuiView extends Frame{
    
    private JButton beliButton,displayButton,hapusButton,BackToLoginButton,hapusAllButton;

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

        hapusButton = new JButton("HAPUS SATU TRANSAKSI");
        hapusButton.setForeground(Color.white);
        hapusButton.setBackground(color("#2596be"));
        hapusButton.setFocusPainted(false);
        boundedAdd(hapusButton, 100, 320,200, 30);

        hapusAllButton = new JButton("HAPUS SEMUA DATA");
        hapusAllButton.setForeground(Color.white);
        hapusAllButton.setBackground(color("#2596be"));
        hapusAllButton.setFocusPainted(false);
        boundedAdd(hapusAllButton, 100, 370,200, 30);

        BackToLoginButton = new JButton("BACK TO LOGIN");
        BackToLoginButton.setForeground(Color.white);
        BackToLoginButton.setBackground(color("#2596be"));
        BackToLoginButton.setFocusPainted(false);
        boundedAdd(BackToLoginButton, 100, 420,200, 30);




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
        hapusButton.addActionListener((e)->{
            dispose();
            new HapusView().setVisible(true);
        });
        hapusAllButton.addActionListener((e)->{
            new DetailTransaksiController().hapusSemua();
            JOptionPane.showMessageDialog(null, "Semua berhasil di hapus",
                    "hapus", JOptionPane.INFORMATION_MESSAGE);
        });
        BackToLoginButton.addActionListener((e)->{
            AdminLogin al = new AdminLogin();
            al.setVisible(true);
            dispose();
        });

    }
}
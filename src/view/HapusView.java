package view;

import javax.swing.*;


import controller.DetailTransaksiController;

import java.awt.Color;
import java.awt.Font;

public class HapusView extends Frame{

    private JLabel namaLabel;
    private JTextField idField;


    private JButton Hapus,keluar;

    public HapusView() {
        super("Hapus Pmebleian", 300, 200);
    }

    @Override
    protected void component() {
        namaLabel = new JLabel("ID Pengunjung");
        namaLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(namaLabel, 50, 30, 150, 18);

        idField = new JTextField();
        boundedAdd(idField, 50, 55, 150, 30);


        Hapus = new JButton("Hapus");
        Hapus.setForeground(Color.white);
        Hapus.setBackground(color("#2596be"));
        Hapus.setFocusPainted(false);
        boundedAdd(Hapus, 50, 150, 85, 30);

        keluar = new JButton("Keluar");
        keluar.setForeground(Color.white);
        keluar.setBackground(color("#2596be"));
        keluar.setFocusPainted(false);
        boundedAdd(keluar, 150, 150, 85, 30);
    }

    @Override
    protected void event() {
        Hapus.addActionListener((e) -> {
            int id = Integer.parseInt(String.valueOf(idField.getText()));

            DetailTransaksiController transaksi = new DetailTransaksiController();
            boolean objek = transaksi.datacari(id);
            if (objek) {
                transaksi.hapus(id);
                JOptionPane.showMessageDialog(null, "Berhasil Hapus",
                        "hapus", JOptionPane.INFORMATION_MESSAGE);
                new HapusView().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null,
                        "ID " + id + " tidak ada",
                        "ID gagal hapus",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println("ID " + id + " tidak di temukan");
                new HapusView().setVisible(true);
                dispose();
            }
        });

            keluar.addActionListener((d) -> {
                new MenuGuiView().setVisible(true);
                dispose();
        });
    }
}

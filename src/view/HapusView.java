package view;

import javax.swing.*;


import controller.DetailTransaksiController;

import java.awt.Color;
import java.awt.Font;

public class HapusView extends Frame{

    private JLabel namaLabel;
    private JTextField namaField;


    private JButton Hapus,keluar;

    public HapusView() {
        super("Hapus Pmebleian", 300, 200);
    }

    @Override
    protected void component() {
        namaLabel = new JLabel("Nama Pengunjung");
        namaLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(namaLabel, 50, 30, 150, 18);

        namaField = new JTextField();
        boundedAdd(namaField, 50, 55, 150, 30);


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
            String nama = namaField.getText();

            DetailTransaksiController transaksi = new DetailTransaksiController();
            boolean objek = transaksi.datacari(nama);
            if (objek) {
                transaksi.hapus(nama);
                JOptionPane.showMessageDialog(null, "Berhasil Hapus",
                        "hapus", JOptionPane.INFORMATION_MESSAGE);
                new HapusView().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null,
                        "nama" + nama + "tidak ada",
                        "gagal hapus",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println("nama" + nama + "tidak di temukan");
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

package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

import controller.DetailTransaksiController;
import entity.TransaksiEntity;
import javax.swing.JOptionPane;
import java.util.ArrayList;

import java.awt.Color;
import java.awt.Font;

public class BeliView extends Frame{
    private JTable sepatuTable;
    private JLabel idLabel,namaLabel,alamatLabel,cariLabel,jumlahBeliLabel;
    private JTextField idField,namaField,alamaField,carField,jumField;

    private JScrollPane scrollPane;

    private JButton Save,keluar;

    public BeliView() {
        super("BELI SEPATU", 800, 600);
    }

    @Override
    protected void component() {

        idLabel = new JLabel("ID Pengunjung");
        idLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(idLabel, 50, 30, 150, 18);

        idField = new JTextField();
        boundedAdd(idField, 50, 55, 150, 30);

        namaLabel = new JLabel("Nama Pengunjung");
        namaLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(namaLabel, 50, 90, 150, 18);

        namaField = new JTextField();
        boundedAdd(namaField, 50, 115, 150, 30);

        alamatLabel = new JLabel("Alamat Pengunjung");
        alamatLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(alamatLabel, 50, 160, 150, 18);

        alamaField = new JTextField();
        boundedAdd(alamaField, 50, 175, 150, 30);

        cariLabel = new JLabel("Cari Sepatu");
        cariLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(cariLabel, 50, 220, 150, 18);

        carField = new JTextField();
        boundedAdd(carField, 50, 245, 150, 30);

        jumlahBeliLabel = new JLabel("Jumlah Beli");
        jumlahBeliLabel.setFont(new Font("Arial", Font.BOLD, 13));
        boundedAdd(jumlahBeliLabel, 50, 275, 150, 18);

        jumField = new JTextField();
        boundedAdd(jumField, 50, 300, 150, 30);

        sepatuTable = new JTable();
        sepatuTable.setModel(createDataTable());
        scrollPane = new JScrollPane(sepatuTable);
        boundedAdd(scrollPane, 250, 55, 400, 440);

        Save = new JButton("Save");
        Save.setForeground(Color.white);
        Save.setBackground(color("#2596be"));
        Save.setFocusPainted(false);
        boundedAdd(Save, 80, 350, 85, 30);

        keluar = new JButton("Keluar");
        keluar.setForeground(Color.white);
        keluar.setBackground(color("#2596be"));
        keluar.setFocusPainted(false);
        boundedAdd(keluar, 80, 400, 85, 30);
    }

    @Override
    protected void event() {
        Save.addActionListener((e) -> {
            int id = Integer.parseInt(idField.getText());
            String nama = namaField.getText();
            String alamat = alamaField.getText();
            String cari = carField.getText();
            int jumlah = Integer.parseInt(jumField.getText());

            DetailTransaksiController transaksi = new DetailTransaksiController();
            TransaksiEntity objek = transaksi.cari(cari);
            if(objek!=null){
                transaksi.beli(id, nama, alamat, objek);
                JOptionPane.showMessageDialog(null, "Berhasil Dibeli ", "Sukses",
                JOptionPane.INFORMATION_MESSAGE);
                objek.setTotalHarga(jumlah);
                new BeliView().setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Data Tidak Ada", "coba cari Lagi",
                JOptionPane.ERROR_MESSAGE);
                new BeliView().setVisible(true);
                dispose();
            }
        });
        keluar.addActionListener((e)->{
            new MenuGuiView().setVisible(true);
            dispose();
        });
    }

    private DefaultTableModel createDataTable() {
        DefaultTableModel dataTable = new DefaultTableModel();

        Object column[] = {
                "Jenis",
                "Bahan",
                "Ukuran",
                "Harga",
        };
        dataTable.setColumnIdentifiers(column);

        DetailTransaksiController transaksi = new DetailTransaksiController();

        ArrayList<TransaksiEntity> array = transaksi.allTransaksi();

        for (TransaksiEntity objek : array) {

            Object[] data = new String[] {
                    objek.getBarang().getJenisSepatu(),
                    objek.getBarang().getBahan(),
                    String.valueOf(objek.getBarang().getUkuran()),
                    String.valueOf(objek.getHarga())
            };

            dataTable.addRow(data);
        }
        return dataTable;
    }
}

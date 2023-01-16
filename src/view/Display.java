package view;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

import controller.DetailTransaksiController;
import entity.DetailTransaksiEntity;
import java.util.ArrayList;

import java.awt.Color;

public class Display extends Frame{
    private JScrollPane scrollPane;
    private JButton keluar;
    private JTable sepatuTable;

    public Display() {
        super("DISPLAY SEPATU", 900, 600);
    }

    @Override
    protected void component() {
        sepatuTable = new JTable();
        sepatuTable.setModel(createDataTable());
        scrollPane = new JScrollPane(sepatuTable);
        boundedAdd(scrollPane, 50, 55, 800, 440);

        keluar = new JButton("Keluar");
        keluar.setForeground(Color.white);
        keluar.setBackground(color("#2596be"));
        keluar.setFocusPainted(false);
        boundedAdd(keluar, 700, 500, 85, 30);
    }

    @Override
    protected void event() {
        keluar.addActionListener((e)->{
            new MenuGuiView().setVisible(true);
            dispose();
        });
    }

    private DefaultTableModel createDataTable() {
        DefaultTableModel dataTable = new DefaultTableModel();

        Object column[] = {
                "Id Pengunnjung",
                "Nama",
                "alamat",
                "Jenis",
                "Bahan",
                "Ukuran",
                "Total Harga",
                "Tanggal"
        };
        dataTable.setColumnIdentifiers(column);

        DetailTransaksiController transaksi = new DetailTransaksiController();

        ArrayList<DetailTransaksiEntity> array = transaksi.allDetail();

        for (DetailTransaksiEntity objek : array) {

            Object[] data = new String[] {
                    String.valueOf(objek.getPengunjung().getId()),
                    objek.getPengunjung().getNama(),
                    objek.getPengunjung().getAlamat(),
                    objek.getTransaksi().getBarang().getJenisSepatu(),
                    objek.getTransaksi().getBarang().getBahan(),
                    String.valueOf(objek.getTransaksi().getBarang().getUkuran()),
                    String.valueOf(objek.getTransaksi().getTotalHarga()),
                    objek.getTanggal()
            };

            dataTable.addRow(data);
        }
        return dataTable;
    }
}

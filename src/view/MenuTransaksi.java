package view;
import controller.DataTransaksiController;

import java.util.Scanner;

public class MenuTransaksi {
    Scanner input = new Scanner(System.in);
    DataTransaksiController dataTransaksiController = new DataTransaksiController();

    public void menuData(){
        String pilih;
        do {
            System.out.println("==============================");
            System.out.println("         TOKO SEPATU          ");
            System.out.println("            KYONI             ");
            System.out.println("==============================");
            System.out.println("            MENU              ");
            System.out.println("==============================");
            System.out.println("""
                1. Display Sepatu
                2. Beli
                3. Struct Pembeli
                4. Back to Login
                """);
            System.out.print("Choice Input : ");
            pilih = input.nextLine();
            
            switch (pilih) {
                case "1" -> dataTransaksiController.displayTtoMenu();
                case "2" -> dataTransaksiController.inputToMenu();
                case "3" -> dataTransaksiController.displayDtoMenu();
                case "4" -> System.out.println();
                default -> System.err.println("inputan tidak ada");
            }
        }while (!pilih.equals("4"));
    }
}
package view;

import controller.AdminController;

import java.util.Scanner;

public class MenuView {
    Scanner input = new Scanner(System.in);
    AdminController adminController = new AdminController();

    public void menu(){
        String pilih;
        do {
            System.out.println("==============================");
            System.out.println("         TOKO SEPATU          ");
            System.out.println("            KYONI             ");
            System.out.println("==============================");
            System.out.println("            LOGIN             ");
            System.out.println("==============================");
            System.out.println("""
                    1. Login
                    2. Exit
                    ==============================""");
            System.out.print("Choice Input : ");
            pilih = input.nextLine();
            
            switch (pilih) {
                case "1" -> adminController.loginToMenu();
                case "2" -> System.out.println("Leave...");
                default -> System.err.print("Wrong input!!!!");
            }
        }while (!pilih.equals("2"));
    }
}
package model;
import entity.AdminEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminModel {
    static ArrayList<AdminEntity> arrayAdmin = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void dataAdmin(){
        arrayAdmin.add(new AdminEntity(1,"Yu", "123"));
        arrayAdmin.add(new AdminEntity(2,"An",  "234"));
    }

    public static ArrayList<AdminEntity> all(){
        return arrayAdmin;
    }

    public static AdminEntity cari(int id){
        for(AdminEntity objectAdmin : arrayAdmin){
            if(objectAdmin.getId()==id){
                return objectAdmin;
            }
        }
        return null;
    }
}

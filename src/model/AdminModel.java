package model;
import entity.AdminEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminModel {
    static ArrayList<AdminEntity> arrayAdmin = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void dataAdmin(){
        arrayAdmin.add(new AdminEntity(1,"Yu", "123"));
    }

    public static ArrayList<AdminEntity> all(){
        return arrayAdmin;
    }

    public static AdminEntity cari(int id,String pass){
        for(AdminEntity objectAdmin : arrayAdmin){
            if(objectAdmin.getId()==id&&objectAdmin.getPassword().equals(pass)){
                return objectAdmin;
            }
            if(objectAdmin.getPassword()==pass){
                return objectAdmin;
            }
        }
        return null;
    }
}

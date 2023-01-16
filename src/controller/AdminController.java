package controller;
import model.AdminModel;
import entity.AdminEntity;

public class AdminController {

    public AdminEntity cari(int id,String pass){
        return AdminModel.cari(id,pass);
    }
}
package controller;

import entity.AdminEntity;
import model.AdminModel;
//import view.AdminView;
import view.MenuView;

public class AdminController {
    public void loginToMain(){
        MenuView menuView = new MenuView();
        menuView.menu();
    }
//    public void loginToMenu(){
//        AdminView adminView = new AdminView();
//        adminView.login();
//    }
    public boolean cari(String id,String pass){
        AdminEntity admin = AdminModel.cari(id,pass);
        if(admin!=null){
            return true;
        }else{
            return false;
        } 
    }
}
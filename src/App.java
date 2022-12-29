import controller.AdminController;
import model.AdminModel;
import model.DataBajuModel;

public class App {
    public static void main(String[] args) throws Exception {
        AdminController adminController = new AdminController();
        AdminModel.dataAdmin();
        DataBajuModel.dataBarang();
        adminController.loginToMain();
    }
}
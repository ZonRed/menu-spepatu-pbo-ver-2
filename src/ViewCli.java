import controller.AdminController;
import model.AdminModel;
import model.DataSepatuModel;
    public class ViewCli {
        public static void main(String[] args) throws Exception {
            AdminController adminController = new AdminController();
            AdminModel.dataAdmin();
            DataSepatuModel.dataBarang();
            adminController.loginToMain();
        }
    }

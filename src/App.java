import model.AdminModel;
import model.DataSepatuModel;
import view.AdminLogin;
import view.Display;

public class App {
    public static void main(String[] args) throws Exception {
        AdminModel.dataAdmin();
        DataSepatuModel.dataBarang();
        new AdminLogin().setVisible(true);

//        new Display().setVisible(true);
    }
}
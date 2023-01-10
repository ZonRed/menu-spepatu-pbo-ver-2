package gui;

import javax.swing.*;

public class MainScreen extends JFrame {
    private JPanel PanelMain;
    private JTextField TextFieldUssername;
    private JTextField TextFieldPassword;
    private JButton ButtonLogin;
    private JButton ButtonExit;
    private JLabel LOGINLabel;

    public MainScreen(){
        setTitle("coba");
        setSize(500,300);
        setLayout(null);

        createUIComponents();
    }


    private void createUIComponents() {
        PanelMain = new JPanel();
        LOGINLabel= new JLabel("LOGIN");
        LOGINLabel.setBounds(75,20,200,30);
        TextFieldUssername = new JTextField("USSERNAME...");
        TextFieldUssername.setBounds(75,50,200,30);
        TextFieldPassword = new JTextField("PASSWORD..");
        TextFieldPassword.setBounds(75,100,200,30);
        ButtonLogin = new JButton("Login");
        ButtonLogin.setBounds(75,150,100,30);
        ButtonExit = new JButton("Exit");
        ButtonExit.setBounds(75,200,100,30);


        add(PanelMain);
        add(LOGINLabel);
        add(TextFieldUssername);
        add(TextFieldPassword);
        add(ButtonLogin);
        add(ButtonExit);
    }
    public static void main(String[] args){
        MainScreen m = new MainScreen();
        m.setVisible(true);

    }
    private void event(){
        TextFieldUssername.addActionListener((e)->{

        }
        );}

}

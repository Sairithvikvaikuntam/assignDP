import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    Login login;
    Main(){
        login = new Login();
        setLayout(new BorderLayout());
        add(login, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main m = new Main();
        m.setSize(600, 400);
        m.setVisible(true);
        m.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
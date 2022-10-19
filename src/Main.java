import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    Main(){
        Facade f = new Facade();
        f.login(f);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main m = new Main();
    }
}
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main{
    Main(){
        Facade f = new Facade();
        f.setSize(1900, 1000);
        f.login(f);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main m = new Main();
    }
}
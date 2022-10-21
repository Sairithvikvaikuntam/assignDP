import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    Main() throws IOException {
        Facade f = new Facade();
        f.setSize(1900, 1000);
        f.login(f);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("\n         <<<<<<<<<<<<< Facade Pattern >>>>>>>>>>>>>   \n");
        Main m = new Main();
    }
}
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
        Main m = new Main();
        OfferingList l = new OfferingList();
        OfferingIterator l_itr = l.get_itr();
        while(l_itr.hasNext()){
            System.out.println(l_itr.next());
        }
        Trading t = new Trading();
        t.accept(new ReminderVisitor());
        ClassProductList c = new ClassProductList();
        c.accept(new ReminderVisitor());
    }
}
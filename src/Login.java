import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Login extends JPanel implements ActionListener{
    public static int UserType = -1;
    static String Username;

    JLabel password1;
    JLabel label;
    JTextField username;
    JLabel h;
    JButton button,button1;
    JPasswordField Password;
    static JRadioButton b;
    static JRadioButton se;
    static JRadioButton x;
    static JRadioButton y;
    Person p1,a;
    public static String menuType=null;
    Login(){
        setLayout(null);

        b = new JRadioButton("Buyer");
        b.setBounds(100,150,120,50);

        se = new JRadioButton("Seller");
        se.setBounds(250,150,120,50);

        label = new JLabel("Username");
        label.setBounds(100, 8, 70, 20);

        username = new JTextField();
        username.setBounds(100, 27, 193, 28);

        password1 = new JLabel("Password");
        password1.setBounds(100, 55, 70, 20);

        Password = new JPasswordField();
        Password.setBounds(100, 75, 193, 28);

        button = new JButton("Login");
        button.setBounds(100, 110, 90, 25);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        button.addActionListener(this);

        addComp();
    }
    public void addComp(){
        add(b);
        add(se);
        add(label);
        add(username);
        add(password1);
        add(Password);
        add(button);
        ButtonGroup ut = new ButtonGroup();
        ut.add(b);
        ut.add(se);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Username = username.getText();
            String password = new String(Password.getPassword());
            if(b.isSelected()) {
                UserType = 0;
            } else if (se.isSelected()) {
                UserType = 1;
            }
            login(Username, password);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean login(String username, String password) throws IOException {
        File file = null;
        if (b.isSelected()) {
            file = new File("./src/BuyerInfo.txt");
            a = new Buyer();
        } else if (se.isSelected()) {
            file = new File("./src/SellerInfo.txt");
            a = new Seller();
        }
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(file));
        }
        catch (Exception e){
            h = new JLabel("Please Select User Type");
            add(h);
            h.setBounds(100,200,200,100);
            revalidate();
            System.out.println("Select User Type");
        }
        Map<String, String> Credentials = new HashMap<>();
        String s;
        while ((s = br.readLine()) != null) {
            String[] Cred = s.split(":");
            Credentials.put(Cred[0], Cred[1]);
        }
        if (Credentials.containsKey(username) && Credentials.get(username).equals(password)) {
            System.out.println("Logged in");
            removeAll();
            setLayout(new FlowLayout());
            x = new JRadioButton("ProduceMenu");
            y = new JRadioButton("MeatMenu");
            button1 = new JButton("Submit");
            button1.setBounds(100, 250, 90, 25);
            button1.setForeground(Color.WHITE);
            button1.setBackground(Color.BLACK);
            x.setBounds(50,150,120,50);
            y.setBounds(250,150,120,50);
            ButtonGroup b1 = new ButtonGroup();
            b1.add(x);
            b1.add(y);
            add(x);
            add(y);
            add(button1);
            revalidate();
            button1.addActionListener(e -> {
                if (x.isSelected()){
                    menuType = "Produce";
                    ProduceProductMenu p = (ProduceProductMenu) a.createProductMenu();
                    System.out.println("\n             <<<<<<<<<<<<< Factory Pattern >>>>>>>>>>>>>\n");
                    System.out.println("Object of Menu generated on the GUI is using the Factory method pattern");
                    try {
                        if(b.isSelected()) {
                            p1 = new Buyer(username,p);
                        } else if (se.isSelected()) {
                            p1 = new Seller(username, p);
                        }
                        removeAll();
                        revalidate();
                        setLayout(new BorderLayout());
                        System.out.println("\n              <<<<<<<<<<<<< Bridge Pattern >>>>>>>>>>>>>\n");
                        add(p1.showMenu(), BorderLayout.CENTER);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    revalidate();
                } else if (y.isSelected()) {
                    menuType = "Meat";
                    MeatProductMenu m = (MeatProductMenu) a.createProductMenu();
                    System.out.println("\n             <<<<<<<<<<<<< Factory Pattern >>>>>>>>>>>>>\n");
                    System.out.println("Object of Menu generated on the GUI is using the Factory method pattern");
                    try {
                        if(b.isSelected()) {
                            p1 = new Buyer(username, m);
                        } else if (se.isSelected()) {
                            p1 = new Seller(username, m);
                        }
                        removeAll();
                        revalidate();
                        setLayout(new BorderLayout());
                        System.out.println("\n              <<<<<<<<<<<<< Bridge Pattern >>>>>>>>>>>>>\n");
                        add(p1.showMenu(), BorderLayout.CENTER);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    revalidate();
                }
            });
            System.out.println("\n              <<<<<<<<<<<<< Iterator Pattern >>>>>>>>>>>>>\n");
            System.out.println("\n Offering List \n");
            OfferingList l = new OfferingList();
            OfferingIterator l_itr = l.get_itr();
            while(l_itr.hasNext()){
                System.out.println(l_itr.next());
            }
            return true;
        } else {
            if(this.h!=null) {
                h.setBounds(0, 0, 0, 0);
            }
            JLabel i = new JLabel("INVALID CREDENTIALS. PLEASE TRY AGAIN.");
            add(i);
            i.setBounds(100,200,1000,100);
            revalidate();
            System.out.println("Invalid Credentials");
            return false;
        }
    }
}
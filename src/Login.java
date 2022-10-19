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
    int UserType = -1;
    JLabel password1;
    JLabel label;
    JTextField username;
    JButton button,button1;
    JPasswordField Password;
    JRadioButton b,se,x,y;
    Person p1;

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
            String Username = username.getText();
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
        if(b.isSelected()) {
            file = new File("./src/BuyerInfo.txt");
        } else if (se.isSelected()) {
            file = new File("./src/SellerInfo.txt");
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        Map<String, String> Credentials = new HashMap<>();
        String s;
        while ((s = br.readLine()) != null) {
            String[] Cred = s.split(" ");
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
                    ProduceProductMenu p = new ProduceProductMenu();
                    try {
                        if(b.isSelected()) {
                            p1 = new Buyer(p);
                        } else if (se.isSelected()) {
                            p1 = new Seller(p);
                        }
                        removeAll();
                        revalidate();
                        setLayout(new BorderLayout());
                        add(p1.showMenu(), BorderLayout.CENTER);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    revalidate();
                } else if (y.isSelected()) {
                    MeatProductMenu m = new MeatProductMenu();
                    try {
                        if(b.isSelected()) {
                            p1 = new Buyer(m);
                        } else if (se.isSelected()) {
                            p1 = new Seller(m);
                        }
                        removeAll();
                        revalidate();
                        setLayout(new BorderLayout());
                        add(m.showMenu(), BorderLayout.CENTER);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    revalidate();
                }
            });
            return true;
        } else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }
}
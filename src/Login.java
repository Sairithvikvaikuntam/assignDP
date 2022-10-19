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
import java.util.Scanner;

public class Login extends JPanel implements ActionListener{
    int userType;
    JLabel password1;
    JLabel label;
    JTextField username;
    JButton button;
    JPasswordField Password;
    JRadioButton b;
    JRadioButton s;
    Login(){
        setLayout(null);

        b = new JRadioButton("Buyer");
        b.setBounds(100,150,120,50);

        s = new JRadioButton("Seller");
        s.setBounds(250,150,120,50);

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
        add(s);
        add(label);
        add(username);
        add(password1);
        add(Password);
        add(button);
        ButtonGroup ut = new ButtonGroup();
        ut.add(b);
        ut.add(s);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String Username = username.getText();
            String password = new String(Password.getPassword());
            login(Username, password);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean login(String username, String password) throws IOException {
        File file = null;
        if(b.isSelected()) {
            file = new File("./src/Buyer.txt");
        } else if (s.isSelected()) {
            file = new File("./src/Seller.txt");
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        Map<String, String> Credentials = new HashMap<>();
        while ((s = br.readLine()) != null) {
            String[] Cred = s.split(" ");
            Credentials.put(Cred[0], Cred[1]);
        }
        if (Credentials.containsKey(username) && Credentials.get(username).equals(password)) {
            System.out.println("Logged in");
            return true;
        } else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }
}
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class ProduceProductMenu extends JPanel implements ProductMenu{
	static JList jl;

	public Component showMenu() throws IOException {
		File file = new File("./src/ProductInfo.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> produceMenu = new ArrayList<>();
		String s;
		while ((s = br.readLine()) != null) {
			String[] prod = s.split(":");
			if(prod[0].equals("Produce")){
				produceMenu.add(prod[1]);
			}
		}
		StringBuilder text = new StringBuilder();
		for (int i=0; i<produceMenu.size();i++){
			text.append("\n"+ produceMenu.get(i));
		}
		JOptionPane.showMessageDialog(null, "Available Products:" + text.toString());
		setLayout(new BorderLayout());
		jl = new JList(produceMenu.toArray());
		return jl;
	}

	public void showAddButton() {
		JButton b = new JButton("Add");
		b.setBounds(300,1000,90,25);
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);
	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}

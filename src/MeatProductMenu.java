import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class MeatProductMenu implements ProductMenu {

	static JList jl;

	public Component showMenu() throws IOException {
		File file = new File("./src/ProductInfo.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> MeatMenu = new ArrayList<>();
		String s;
		while ((s = br.readLine()) != null) {
			String[] prod = s.split(":");
			if(prod[0].equals("Meat")){
				MeatMenu.add(prod[1]);
			}
		}
		StringBuilder text = new StringBuilder();
		for (int i=0; i<MeatMenu.size();i++){
			text.append("\n"+ MeatMenu.get(i));
		}

		JOptionPane.showMessageDialog(null,"Available Products:"+text.toString());

		jl = new JList(MeatMenu.toArray());
		return jl;
	}

	public void showAddButton() {

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

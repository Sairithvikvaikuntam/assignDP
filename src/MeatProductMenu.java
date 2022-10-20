import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class MeatProductMenu implements ProductMenu {

	static JList jl;

	public Component showMenu(String username) throws IOException {
		File file = new File("./src/ProductInfo.txt");
		File file2 = new File("./src/UserProduct.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> MeatMenu = new ArrayList<>();
		String s;
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		ArrayList<String> userMenu = new ArrayList<>();
		String s2;
		while ((s2 = br2.readLine()) != null){
			String[] u = s2.split(":");
			if (u[0].equals(username)){
				userMenu.add(u[1]);
			}
		}
		while ((s = br.readLine()) != null) {
			String[] prod = s.split(":");
			if(prod[0].equals("Meat")){
				MeatMenu.add(prod[1]);
			}
		}
		userMenu.retainAll(MeatMenu);
		StringBuilder text = new StringBuilder();
		for (int i=0; i<userMenu.size();i++){
			text.append("\n"+ userMenu.get(i));
		}

		JOptionPane.showMessageDialog(null,"Available Products:"+text.toString());

		jl = new JList(userMenu.toArray());
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

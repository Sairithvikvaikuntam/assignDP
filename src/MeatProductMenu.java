import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class MeatProductMenu implements ProductMenu {

	static JList jl;
	static ArrayList<String> userMenu;

	public Component showMenu(String username) throws IOException {
		System.out.println("\n Showing Menu using the Bridge Pattern in GUI");
		File file = new File("./src/ProductInfo.txt");
		File file2 = new File("./src/UserProduct.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> MeatMenu = new ArrayList<>();
		String s;
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		userMenu = new ArrayList<>();
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
		System.out.println("\n                <<<<<<<<<<<Visitor Pattern>>>>>>>>>>>\n");
		Trading t = new Trading();
		t.accept(new ReminderVisitor());
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

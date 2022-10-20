import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Seller extends Person {

	protected Seller(String username, ProductMenu productMenu) {
		super(username,productMenu);
	}

	public Component showMenu() throws IOException {
		JComponent x = (JComponent) productMenu.showMenu(username);
		return x;
	}

	public ProductMenu createProductMenu() {
		ProductMenu spm=null;
		if(Login.menuType == "Produce"){
			spm = new ProduceProductMenu();
		} else if (Login.menuType == "Meat") {
			spm = new MeatProductMenu();
		}
		return spm;
	}

}

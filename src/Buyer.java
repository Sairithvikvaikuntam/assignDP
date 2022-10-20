import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Buyer extends Person {
	protected Buyer(String username, ProductMenu productMenu) {
		super(username, productMenu);
	}

	public Component showMenu() throws IOException {
		JComponent x = (JComponent) productMenu.showMenu(username);
		return x;
	}

	public ProductMenu createProductMenu() {
		ProductMenu bpm=null;
		if(Login.menuType=="Produce"){
			bpm = new ProduceProductMenu();
		} else if (Login.menuType=="Meat") {
			bpm = new MeatProductMenu();
		}
		return bpm;
	}

}

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Buyer extends Person {

	protected Buyer(ProductMenu productMenu) {
		super(productMenu);
	}

	public Component showMenu() throws IOException {
		JComponent x = (JComponent) productMenu.showMenu();
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

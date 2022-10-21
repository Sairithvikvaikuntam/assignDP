import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Buyer extends Person {
	protected Buyer(String username, ProductMenu productMenu) {
		super(username, productMenu);
	}

    public Buyer() {
        super();
    }

    public Component showMenu() throws IOException {
		JComponent x = (JComponent) productMenu.showMenu(username);
		return x;
	}

	public ProductMenu createProductMenu() {
		ProductMenu bpm=null;
		if(Login.menuType.equals("Produce")){
			bpm = new ProduceProductMenu();
		} else if (Login.menuType.equals("Meat")) {
			bpm = new MeatProductMenu();
		}
		return bpm;
	}

}

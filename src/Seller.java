import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Seller extends Person {

	protected Seller(ProductMenu productMenu) {
		super(productMenu);
	}

	public Component showMenu() throws IOException {
		JComponent x = (JComponent) productMenu.showMenu();
		return x;
	}

	public ProductMenu createProductMenu() {
		return null;
	}

}

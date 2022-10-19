import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Buyer extends Person {

	protected Buyer(ProductMenu productMenu) {
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

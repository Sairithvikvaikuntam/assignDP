import java.awt.*;
import java.io.IOException;

public abstract class Person {

	protected ProductMenu productMenu;

	protected Person(ProductMenu productMenu){
		this.productMenu = productMenu;
	}

	public abstract Component showMenu() throws IOException;

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public abstract ProductMenu createProductMenu();

}

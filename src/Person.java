import java.awt.*;
import java.io.IOException;

public abstract class Person {

	protected ProductMenu productMenu;
	String username;
	protected Person(String username, ProductMenu productMenu){
		this.username = username;
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

	public ProductMenu createProductMenu() {
		return null;
	}

}

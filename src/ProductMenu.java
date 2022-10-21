import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract interface ProductMenu {

	public Component showMenu(String username) throws IOException;

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

}

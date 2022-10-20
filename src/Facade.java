import javax.swing.*;
import java.awt.*;

public class Facade extends JFrame {
	static Login login;

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login(Facade f) {
		login = new Login();
		setLayout(new BorderLayout());
		add(login, BorderLayout.CENTER);
		f.UserType =  login.UserType;
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		return true;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

	public void accept(NodeVisitor visitor){
		visitor.visitFacade(this);
	}

}

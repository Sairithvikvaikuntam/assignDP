import javax.swing.*;
import java.awt.*;
import java.io.IOException;

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

	public void accept(NodeVisitor visitor){
		visitor.visitFacade(this);
	}

	public void createProductList() {
		Person p = null;
		if(Login.b.isSelected()){
			p = new Buyer();
		} else if (Login.se.isSelected()) {
			p = new Seller();
		}
		p.createProductMenu();
	}

	public void showMenu() throws IOException {
		ProductMenu pm = null;
		if(Login.x.isSelected()){
			pm = new ProduceProductMenu();
		} else if (Login.y.isSelected()) {
			pm = new MeatProductMenu();
		}
		pm.showMenu(Login.Username);
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

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}

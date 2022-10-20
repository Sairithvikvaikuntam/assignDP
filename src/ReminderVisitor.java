public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("This is a product:"+product);

	}

	public void visitTrading(Trading trading) {
		System.out.println("This is Trading: "+ trading);
	}

	public void visitFacade(Facade facade) {
		System.out.println("This is Facade: "+ facade);
	}

	public void visitProducts(ClassProductList cpl){
		System.out.println("This is a CPL");
	}

}

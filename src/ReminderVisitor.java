public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("This is a product:"+product);

	}

	public void visitTrading(Trading trading) {
		if (Login.x.isSelected()) {
			System.out.println(Login.Username+" is Trading: " + ProduceProductMenu.userMenu);
		}
		else{
			System.out.println(Login.Username+" is Trading: " + MeatProductMenu.userMenu);
		}

	}

	public void visitFacade(Facade facade) {
		System.out.println("This is Facade: "+ facade);
	}

	public void visitProducts(ClassProductList cpl){
		System.out.println("This is a CPL");
	}

}

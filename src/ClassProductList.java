import java.util.ArrayList;

public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;

	ArrayList<Product> cpl = new ArrayList<>();
	public ClassProductList(){
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		Product p6 = new Product();
		Product p7 = new Product();
		cpl.add(p1);
		cpl.add(p2);
		cpl.add(p3);
		cpl.add(p4);
		cpl.add(p5);
		cpl.add(p6);
		cpl.add(p7);
	}

	public ProductIterator get_itr(){
		productIterator= new ProductIterator(this);
		return productIterator;
	}
	public void accept(NodeVisitor visitor) {

	}

}

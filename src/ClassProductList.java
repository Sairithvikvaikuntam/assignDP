import java.util.ArrayList;

public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;

	ArrayList<String> cpl = new ArrayList<>();
	public ClassProductList(){
		cpl.add("p1");
		cpl.add("p2");
		cpl.add("p3");
		cpl.add("p4");
	}

	public ProductIterator get_itr(){
		productIterator= new ProductIterator(this);
		return productIterator;
	}
	public void accept(NodeVisitor visitor) {
		visitor.visitProducts(this);
	}
}

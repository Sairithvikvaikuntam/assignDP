public class Product extends Object{

	private Trading trading;

	public void accept(NodeVisitor visitor){
		visitor.visitProduct(this);
	}

}

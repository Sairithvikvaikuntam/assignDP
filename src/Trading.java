public class Trading {
	private Product product;
	private OfferingList offeringList;
	public void accept(NodeVisitor visitor) {
		visitor.visitTrading(this);
	}

}

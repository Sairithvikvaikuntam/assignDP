public class ProductIterator implements ListIterator {

	ClassProductList cpl;
	int index;
	public ProductIterator(ClassProductList cpl) {
		this.cpl = cpl;
		index = 0;
	}

	public boolean hasNext() {
		if(index<cpl.size()) {
			return true;
		}
		return false;
	}

	public Offering next() {
		if(this.hasNext()){
			return (Offering) cpl.get(index++);
		}
		return null;
	}

	public void moveToHead() {

	}

	public void remove() {
		cpl.remove(index);
	}

}

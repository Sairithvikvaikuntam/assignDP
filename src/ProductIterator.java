public class ProductIterator implements ListIterator {

	ClassProductList cpl;
	int index;
	public ProductIterator(ClassProductList cpl) {
		this.cpl = cpl;
		index = 0;
	}

	public boolean hasNext() {
		if(index<cpl.cpl.size()) {
			return true;
		}
		return false;
	}

	public String next() {
		if(this.hasNext()){
			return cpl.cpl.get(index++).toString();
		}
		return null;
	}

	public void moveToHead() {

	}

	public void remove() {
		cpl.remove(index);
	}

}

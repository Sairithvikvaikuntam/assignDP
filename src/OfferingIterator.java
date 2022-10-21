public class OfferingIterator implements ListIterator {

	OfferingList ol;
	int index;
	public OfferingIterator(OfferingList ol){
		this.ol = ol;
		index=0;
	}

	public boolean hasNext() {
		if(index<ol.oList.size()) {
			return true;
		}
		return false;
	}

	public String next() {
		if(this.hasNext()){
			return (String) ol.oList.get(index++);
		}
		return null;
	}

	public void remove() {
		ol.remove(index);
	}

	public void moveToHead() {

	}

}

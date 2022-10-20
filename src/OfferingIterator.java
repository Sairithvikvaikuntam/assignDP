public class OfferingIterator implements ListIterator {

	OfferingList ol;
	int index;
	public OfferingIterator(OfferingList ol){
		this.ol = ol;
		index=0;
	}

	public boolean hasNext() {
		if(index<ol.ol.size()) {
			return true;
		}
		return false;
	}

	public Offering next() {
		if(this.hasNext()){
			return (Offering) ol.ol.get(index++);
		}
		return null;
	}

	public void remove() {
		ol.remove(index);
	}

	public void moveToHead() {

	}

}

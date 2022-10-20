import java.util.ArrayList;

public class OfferingList extends ArrayList {
	ArrayList<Offering> ol = new ArrayList<>();
	public OfferingList(){
		Offering f1 = new Offering();
		Offering f2 = new Offering();
		Offering f3 = new Offering();
		Offering f4 = new Offering();
		Offering f5 = new Offering();
		Offering f6 = new Offering();
		Offering f7 = new Offering();
		ol.add(f1);
		ol.add(f2);
		ol.add(f3);
		ol.add(f4);
		ol.add(f5);
		ol.add(f6);
		ol.add(f7);
	}
	private OfferingIterator offeringIterator;
	public OfferingIterator get_itr(){
		offeringIterator = new OfferingIterator(this);
		return offeringIterator;
	}

	private Trading trading;



}

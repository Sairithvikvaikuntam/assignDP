import java.io.*;
import java.util.ArrayList;

public class OfferingList extends ArrayList {
	ArrayList<String> oList = new ArrayList<>();
	public OfferingList() throws IOException {
		File file2 = new File("./src/ProductInfo.txt");
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		String s2;
		while((s2 = br2.readLine()) != null){
			String[] u = s2.split(":");
			oList.add(u[1]);
		}
	}
	private OfferingIterator offeringIterator;
	public OfferingIterator get_itr(){
		offeringIterator = new OfferingIterator(this);
		return offeringIterator;
	}

	private Trading trading;



}

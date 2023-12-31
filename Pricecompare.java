package comparable;

import java.util.Comparator;

public class Pricecompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return p1.price-p2.price;
	}

}

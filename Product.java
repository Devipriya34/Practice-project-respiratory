package comparable;
import java.lang.Comparable;

public class Product implements Comparable {
	String brandname;
	int price;
	public Product(String brandname, int price) {
		super();
		this.brandname = brandname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [brandame=" + brandname + ", price=" + price +  "]";
	}
	@Override
	public int compareTo(Object o) {
		Product p1=(Product)o;
		return this.price-p1.price;//Ascending 
		//return p1.price-this.price;//Descending
		//return brandname.compareTo(p1.brandname);
		
	}
	

}
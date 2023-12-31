package comparable;

import java.util.Arrays;

public class ProductTest {

	public static void main(String[] args) {
		Product[]a= {
				new Product("puma",30),
				new Product("sports",60),
				new Product("dress",90)
		};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		System.out.println("After  sorting");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}

}

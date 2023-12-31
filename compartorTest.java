package comparable;

import java.util.Arrays;

public class compartorTest {

	public static void main(String[] args) {
		Product[]a= {
				new Product("puma",30),
				new Product("sports",30),
				new Product("dress",90)
		};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		System.out.println("After  sorting");
		Arrays.sort(a,new Brandcompare());
		System.out.println(Arrays.toString(a));
		
		System.out.println("***************************************");
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		System.out.println("After  sorting");
		Arrays.sort(a,new Pricecompare());
		System.out.println(Arrays.toString(a));

	}

}

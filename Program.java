import java.util.Arrays;

public class Program {

	public static void main(String[] args) 
	{
	  int[]arr= {3,6,2,9,5,7};
	  Arrays.sort(arr);
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println();
	  int ele=5;
	  System.out.println("Index of the searching element is:"+" "+Arrays.binarySearch(arr, ele));
	 
	}

}

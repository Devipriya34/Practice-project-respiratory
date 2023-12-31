
public class ArrayAscending {
	static boolean arrayAscen(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1]) return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		int[]arr= {1,2,90,55,60,100};
		if(arrayAscen(arr))
			System.out.println("Array is in Ascending order");
		else
			System.out.println("Array is NOT In Ascending order");
	}

}

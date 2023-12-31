
public class SmallestEvenNum {
	static int smallestEven(int[]arr)
	{
		int smallestEvennum=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2==0 && arr[i]<smallestEvennum) {
				smallestEvennum=arr[i];
			}
		}
	
		return smallestEvennum;
		
	}

	public static void main(String[] args) {
		
    int[]arr= {10,40,50,6,3,100,5,200};
    int result=smallestEven(arr);
    System.out.println("Smallest Even number is :"+result);
	}
}



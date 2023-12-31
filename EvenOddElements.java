
public class EvenOddElements {

	public static void main(String[] args) {
		int[]arr= {1,2,7,9,16,99,100};
		int Ecount=0;
		int Ocount=0;
		for(int element:arr)
		{
			if(element%2==0)
			{
				Ecount++;
			}
			else
				Ocount++;
		}
		System.out.println("Even Elements :"+Ecount);
		System.out.println("Odd Elements :"+Ocount);

	}

}

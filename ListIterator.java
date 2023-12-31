import java.util.ArrayList;
public class ListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(5);
		li.add(85);
		li.add(75);
		li.add(65);
		java.util.ListIterator<Integer> i=li.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//i.remove();
		li.add(45);
		
		System.out.println(li);
        
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		
		 
        
		
	} 

}

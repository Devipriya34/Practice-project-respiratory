import java.util.HashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class HashmapIterator {

	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<>();
		h.put("india",500);
		h.put("london",700);
		h.put("uSA",900);
		Iterator<String> k=h.keySet().iterator();
		while(k.hasNext())
		{
			System.out.println(k.next());
		}
		System.out.println();
		Iterator<Integer> v=h.values().iterator();
		while(v.hasNext())
		{
			System.out.println(v.next());
		}	
		System.out.println();
		Iterator<Entry<String, Integer>> e=h.entrySet().iterator();
		while(e.hasNext())
		{
			System.out.println(e.next());
			
		}
		System.out.println();
		
		
		//we can convert Enumeration object into iterator object then
		//finally returns the iterator<Object>.
		Properties p=new Properties();
        p.setProperty("url", "LocalHost");
        p.setProperty("username", "admin");
		Iterator<Object> i=p.elements().asIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		//In Hashtable->legacy class->Enumeration type
		//now we can convert Enumeration object into iterator object then
		//finally returns the iterator<Object>.
		
		System.out.println();
		Hashtable<Integer, String> hb=new Hashtable<>();
		hb.put(101, "Gayathri");
		hb.put(201, "Dileep");
		hb.put(301, "Tharak");
		Iterator<String> li=hb.elements().asIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
			
		}
	}

	
}

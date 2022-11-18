package DemoSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 TreeSet hs= new TreeSet();
		
		hs.add("Akash");
		hs.add("Prajakta");
		hs.add("Tiwari");
		hs.add("sayali");
		hs.add("Sudhir");
		hs.add("Ruksar");
		
	//	System.out.println(hs);
		
	/*	for (Object o : hs) {
			
			System.out.println(o);
		}*/
		
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}

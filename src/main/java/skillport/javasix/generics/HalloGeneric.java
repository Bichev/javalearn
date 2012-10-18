package skillport.javasix.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HalloGeneric {
	
	public static void main (String ...strings) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
//		list.add("4");
		
		for (Iterator<Integer> it = list.iterator(); it.hasNext(); ){
			int value = (it.next())*10;
			System.out.println(value);
		}
		
	}

}

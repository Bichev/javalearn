package skillport.javasix.enumtest;

public class EnumTest {

	public static enum Month {Jan, Feb, March, April, 
		May, June, Jul, Aug, Sep, Oct, Nov, Dec}
	
	public static void main (String ... args) {
//		System.out.println(Month.values()); 
		for (Month m : java.util.EnumSet.range(Month.March, Month.Oct)){
			System.out.println(m);
		}
	}
}

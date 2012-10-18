package skillport.javasix.generics;

public class GenTest {

	public static void main (String ...strings) {
		Gen<Integer> a = new Gen<Integer>(new Integer(5));
		Gen<Integer> b = new Gen<Integer>(new Integer(5));
		Gen<String> str = new Gen<String>(new String("hallo"));
		
		GenSubclass<String, Integer> subGen = new GenSubclass("Deer", 35);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}

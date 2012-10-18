package skillport.javasix.javalang;

public class WrapExample {
	
	public static void main (String ...strings){
		String s = strings[0];
		
		Boolean wrapBool = Boolean.valueOf("true");
		
		Long wrapLong = new Long("32424234");
		
		Character wrapChar = new Character('w');
		
		Float f1 = new Float(4.7f);
		Float f2 = new Float(5.3f);
		
		int compareFloat = Float.compare(f1.floatValue(), f2.floatValue());
		System.out.println(compareFloat);
		
		Integer myInt = Integer.getInteger("parampam pam.hax", 5);
		System.out.println(myInt);
		
		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException nfe){
			nfe.getMessage();
		}
	}

}

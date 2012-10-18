package skillport.javasix.javalang;

public class BitManipulations {
	
	public static void main (String ...strings){
		int num = 53;
		
		System.out.println(Integer.bitCount(num));
		
		System.out.println(Integer.highestOneBit(num));
		
		System.out.println(Integer.reverse(num));
		
		System.out.println(Integer.toBinaryString(num));
	}

}

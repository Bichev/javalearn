package skillport.javasix.javalang;

import java.io.UnsupportedEncodingException;

public class StringExample {
	
	public static void main (String ...strings){
		byte[] encodeBytes = new byte[]{15, 22, 22, 53, 96, 17};
		try {
			String str = new String (encodeBytes, "UTF-8");
			
			System.out.println(str);
			
		} catch (UnsupportedEncodingException e){
			e.getMessage();
		}
		
		char[] charArray = new char[]{'h','a','l','l','o'};
		String str = new String(charArray);
		System.out.println(str);
		
		 
		String[] emptyString = {null , "whatever", ""};
		for  (String s : emptyString){
			try{
				System.out.println(s + " "+ s.isEmpty());				
			} catch (NullPointerException e){
				e.printStackTrace();
			}

		}
	}

}

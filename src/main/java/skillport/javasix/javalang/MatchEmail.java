package skillport.javasix.javalang;

import java.lang.String;
import java.lang.System;

public class MatchEmail {
	
	public static void main (String ...strings){
		
		if (strings.length == 0){
			System.out.println("please include email");
			return;
		}
		
		String email = strings[0];
		boolean isEmail = email.matches
				("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		if(isEmail) {
			System.out.println("valid email");

			String thePattern = "\\.com";
			email = email.replaceFirst(thePattern, ".net");
			System.out.println(email);
			
			email = email.replaceAll("v", "_");
			System.out.println(email);
			
			email = email.replaceAll(".", "_");
			System.out.println(email);
		} else {
			System.out.println("not valid email");			
		}
	}

}

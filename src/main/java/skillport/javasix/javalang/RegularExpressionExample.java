package skillport.javasix.javalang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {
	
	public static void main (String ...strings){
		String regex = "[0-9][0-9][a-z]";
		String input = "89t";
		
		Pattern pat = Pattern.compile(regex);
		Matcher match = pat.matcher(input);
		boolean matchFound = match.matches();

		if(matchFound)
			System.out.println("was found");
		else
			System.out.println("not found");
		
		
	}

}

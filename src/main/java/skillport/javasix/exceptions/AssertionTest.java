package skillport.javasix.exceptions;

import java.util.Scanner;

public class AssertionTest {
	
    static {
        boolean assertsEnabled = false;
        assert assertsEnabled = true; // Intentional side effect!!!
        if (!assertsEnabled)
            throw new RuntimeException("Asserts must be enabled!!!");
    }
	
	public static void main (String ...strings){
		int month = 5;
		if ((month >= 1) && (month <=12))
			System.out.println("correct");
		else
			assert false : "invalid month" ;
		
		  Scanner scanner = new Scanner( System.in );
		  
		  System.out.print( "Enter a number between 0 and 20: " );
		  int value = scanner.nextInt();
		  assert( (value >= 0) && (value <= 20) ) :
		  "Invalid number: " + value;
		  System.out.printf( "You have entered %d\n", value );
	}

}

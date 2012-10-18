package skillport.javasix.javalang;

public class StringBufferDemo {
	  static void printBuffer( StringBuffer buf ) {
	        System.out.println( "buf = " + buf );
	        System.out.println( "length = " + buf.length() );
	        System.out.println( "capacity = " + buf.capacity() );
	    }
	    public static void main( String [] args ) {
	        StringBuffer buf = new StringBuffer( "This is a StringBuffer." );
	        printBuffer( buf );  // prints "This is a StringBuffer.",
	                             // length = 23, capacity = 39
	        buf.setLength ( 7 );
	        printBuffer( buf );  // prints "This is",
	                             // length = 7, capacity = 39
	        StringBuffer buf2 = new StringBuffer( 10 );
	        printBuffer( buf2 );  // prints "",
	                              // length = 0, capacity = 10
	        buf2.append( "Write once, run anywhere.") ;
	        printBuffer( buf2 );  // prints "Write once, run anywhere."
	                              // length = 25, capacity = 25
	        buf2.setCharAt( 10, '.' );
	        buf2.setCharAt( 12, 'R' );
	        printBuffer( buf2 );  // prints "Write once. Run anywhere."
	                              // length = 25, capacity = 25
	        StringBuffer buf3 = new StringBuffer();
	        buf3 = buf2.insert( 12, "Distribute. " );
	        printBuffer( buf3 );  // prints "Write once. Distribute. Run anywhere."
	                              // length = 37, capacity = 41
	        buf3 = buf3.append( " Hooray!" );
	        printBuffer( buf3 );  // prints "Write once.  Distribute. Run anywhere. Hooray!"
	                              // length = 45, capacity = 57
	        CharSequence charSeq = "Java" ;
	        StringBuffer buf4 = new StringBuffer( charSeq );
	        printBuffer( buf4 );  // prints "Java"
	                              // length = 4, capacity = 20
	        buf4.reverse();
	        printBuffer( buf4 );  // prints "avaJ"
	                              // length = 4, capacity = 20
	    }

}

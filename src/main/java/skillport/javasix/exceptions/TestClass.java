package skillport.javasix.exceptions;

public class TestClass {
	int publicintval ;

	public static void main (String[] args) {
		TestClass t = new TestClass () ;
		try {

			t.secondMethod (5) ;
			t.secondMethod (-1) ;
		}
		catch (Exception e) {
			System.out.println (e.getMessage()) ;
			System.out.println (e.getCause().getMessage()) ;
		}

	}

	void firstMethod (int x)
		throws TooBigException, Exception {
		if (x > 3)
			throw new TooBigException ();
		if (x < 0)
			throw new Exception ("Argument below zero") ;
	}

	void secondMethod (int x) throws Exception {
		try {
			firstMethod (x);
		}
		catch (TooBigException e) {
			System.out.println ("The exception has been caught.");
			e.printStackTrace ();
		}
		catch (Exception e) {
			System.out.println ("Unknown exception caught") ;
			Exception myExcept = new Exception ("Unknown exception") ;
			myExcept.initCause (e) ;
			throw myExcept ;
		}
		finally {
			System.out.println ("This is the finally block.") ;
		}
	}
}

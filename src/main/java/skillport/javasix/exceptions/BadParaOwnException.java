package skillport.javasix.exceptions;

public class BadParaOwnException extends Exception {
	
	//one extra member
	private Object badParam;

	public BadParaOwnException (Object param, String description){
		super (description);
		badParam = param;
	}
}

package skillport.javasix.instanceandclass;

public class NewVars {
	
	private static int counter;
	
	private int someInt;
	
	public static  String CONSTANT = "const";
	
	public final void method1 () {
		
	}	
	
	public void method1 (final Integer int1) {
//		int1 = 253;
	}
	
	public void method1 (String strings) {
		
	}
	
	private void privateMethod (){
		
	}
	
	public static void main (String ...strings){
		NewVars newVars = new NewVars();
		NewVars.CONSTANT = "";
		newVars.CONSTANT = "12345";
		
		System.out.println(counter);
	}

}

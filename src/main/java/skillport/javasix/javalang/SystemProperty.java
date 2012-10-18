package skillport.javasix.javalang;

public class SystemProperty {
	
	public static void main (String ...strings){
		System.out.println(System.getProperty("java.class.path"));
		
		System.getProperties().list(System.out);
		
		System.out.println(java.lang.System.getenv());
		
		System.out.println("sdf");
	}

}

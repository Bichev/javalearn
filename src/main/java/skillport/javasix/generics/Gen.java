package skillport.javasix.generics;

public class Gen <T> {
	
	private T genericValue;
	
	public Gen (){
	}
	
	public Gen(T genericValue){
		this.genericValue = genericValue;
		System.out.println(genericValue);
	}
	
	public T get() {
		return genericValue;
	}
	
	public void set (T genericValue){
		this.genericValue = genericValue;
	}

}

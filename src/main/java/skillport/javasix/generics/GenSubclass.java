package skillport.javasix.generics;

public class GenSubclass< T, V > extends Gen<T>{

	private T name;
	private V age;
	
	public GenSubclass(T name, V age){
		this.name = name;
		this.age = age;
	}
}

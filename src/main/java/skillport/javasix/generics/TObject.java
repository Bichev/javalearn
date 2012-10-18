package skillport.javasix.generics;

public class TObject <T> {
	
	T obj;
	
	public TObject(T obj) {
		this.obj = obj;
	}
	
	public T getObj(){
		return obj;
	}

}

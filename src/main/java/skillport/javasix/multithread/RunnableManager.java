package skillport.javasix.multithread;

public class RunnableManager extends Employee implements Runnable{
	
	public RunnableManager (){
//		super.salary;
	}
	
	public void run (){
		int i = 0;
		while (true){
			if (i >10) break;
			i++;
			System.out.println("it is manager");
		}
		
	}
	

}

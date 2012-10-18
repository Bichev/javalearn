package skillport.javasix.multithread;

public class ThreadUpYield implements Runnable{
	
	public void run (){
		for (int i=0; i<=25; i++){
			System.out.println("Up: " + i);
			Thread.yield();
		}
	}

}

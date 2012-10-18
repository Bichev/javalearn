package skillport.javasix.multithread;

public class ThreadUp extends Thread {
	
	public void run () {
		for (int i = 0; i <= 25; i ++){
			System.out.println("Up: " + i);
			try{
				sleep(500);
			}catch (InterruptedException e){}
		}
	}

}

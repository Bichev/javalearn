package skillport.javasix.multithread;

public class ThreadDown implements Runnable {
	
	public void run () {
		for (int i = 25; i >= 0; i--) {
			System.out.println("Down: " + i);
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){}

		}
	}

}

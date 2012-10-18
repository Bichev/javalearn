package skillport.javasix.multithread;

public class ThreadDownYeld implements Runnable {
	
	public void run(){
		for (int i = 25; i >=0; i--){
			System.out.println("Down: "+ i);
			try{ Thread.sleep(100);
			} catch (InterruptedException e){}

		}
	}

}

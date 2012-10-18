package skillport.javasix.multithread;

public class ThreadA extends Thread{ 
	
	@Override
	public void run(){
		for (int i = 0; i <=10; i++){
			System.out.println("Thread " + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}

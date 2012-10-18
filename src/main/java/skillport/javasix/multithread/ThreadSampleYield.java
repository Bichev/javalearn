package skillport.javasix.multithread;

public class ThreadSampleYield {
	
	public static void main (String ...strings){
		ThreadUpYield upYield = new ThreadUpYield();
		ThreadDownYeld downYeld = new ThreadDownYeld();
		
		Thread upYieldThread = new Thread (upYield);
		Thread downYieldThread = new Thread (downYeld);
		
		upYieldThread.start();
		downYieldThread.start();
	}

}

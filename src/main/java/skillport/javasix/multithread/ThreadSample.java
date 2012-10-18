package skillport.javasix.multithread;

public class ThreadSample { 
	
	public static void main (String ...strings){
		ThreadUp up = new ThreadUp();
		ThreadDown down = new ThreadDown();
		Thread downThread = new Thread (down);
		
		System.out.println("State of downThread is: "+downThread.getState());
		
		up.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority of up: "+ up.getPriority());
		System.out.println("Priority of downThread: "+downThread.getPriority());
		
		up.start();
		downThread.start();
		
		System.out.println("State of downThread is: "+downThread.getState());
		
		RunnableManager rm = new RunnableManager();
		Thread rmThread = new Thread (rm);
//		rmThread.start();
		
		System.out.println("State of rmThread is: "+rmThread.getState());
		System.out.println("Priority of rmThread: "+rmThread.getPriority());
//		rmThread.getState();
	}

}

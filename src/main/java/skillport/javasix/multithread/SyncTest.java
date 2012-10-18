package skillport.javasix.multithread;

public class SyncTest {
	
	public static void main (String ...strings){
		Object objSync = new Object();
		Data data = new Data();
		Thread thread = new Thread(new WaitingThread(objSync, data));
		thread.start();
		
		try{
			System.out.println("main::Sleeping");
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.err.println("main::Interrupted: " + e.getMessage());
		}
		synchronized (objSync) {
			System.out.println("main::Setting value to 1");
			data.value = 1;
			System.out.println("main::notifying thread");
			objSync.notify();
			System.out.println("main::Thread notified");
		}
		
	}
	
	static class Data{
		public int value = 0;
	}
	
	public static class WaitingThread implements Runnable{
		
		private Object objSync;
		private Data data;
		
		
		public WaitingThread(Object objSync, Data data){
			this.objSync = objSync;
			this.data = data;
		}
		 
		public void run (){
			System.out.println("own::Thread started");
			synchronized (objSync) {
				if (data.value == 0){
					try{
						System.out.println("own:: Waiting");
						objSync.wait();
						System.out.println("own::Running again");
					}catch (InterruptedException e) {
						System.err.println("own::Interrupted: " + e.getMessage());
					}
				}
				System.out.println("own:: data value: " + data.value);
			}
		}
	}

}

package skillport.javasix.multithread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MonitorCaptureTest {
	
	static final DateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");
	
	public static void main(String[] args) {
	        Object sync = new Object();
	        Thread t = new Thread(new WaitingThread(sync));
	        t.start();
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException ex) {
	            System.err.println("main::Interrupted: " + ex.getMessage());
	        }
	        synchronized (sync) {
	        	log("main::Calling notify");
	            sync.notify();
	            log("main::Sleeping for 5 seconds");
	            try {
	                Thread.sleep(5000);
	            } catch (InterruptedException ex) {
	                System.err.println("main::Interrupted: " + ex.getMessage());
	            }
	            log("main::Exiting synchronized block");
	        }
	    }

	    static class WaitingThread implements Runnable {

	        private Object sync;

	        public WaitingThread(Object sync) {
	            this.sync = sync;
	        }

	        public void run() {
	            synchronized (sync) {
	            	log("own:: Waiting");
	                try {
	                    sync.wait();
	                } catch (InterruptedException ex) {
	                    System.err.println("own:: Interrupted: " + ex.getMessage());
	                }
	                log("own:: Running again");
	            }
	        }
	    }
	    
	    public static void log (String msg) {
	    	System.out.println(FORMAT.format(new Date())+ ": " + msg);
	    }

}

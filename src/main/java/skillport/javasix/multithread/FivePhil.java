package skillport.javasix.multithread;

import java.awt.* ;
import java.awt.event.* ;

public class FivePhil extends Frame {

  boolean mealTime = false ;
  Philosopher[] philosophers ;
  Thread[] philosopherThread ;
  PhilDisplay[] philDisplay ;
  Chopstick[] chopsticks ;
  Button b, bStall ;
  Label l ;

  public FivePhil () {

    philosophers = new Philosopher[6] ;
    philosopherThread = new Thread[6] ;
    philDisplay = new PhilDisplay[6] ;
    chopsticks = new Chopstick[6] ;

    setSize (350, 350) ;
    setLayout (new FlowLayout()) ;
    l = new Label ("Watch the five philosophers compete for just five chopsticks!") ;
    b = new Button ("Start") ;
    bStall = new Button ("Stall") ;
    for (int i=1; i<=5; i++) {
       philDisplay[i] = new PhilDisplay (i) ;
    }
    add (philDisplay[1]) ;  // add them in this order to simulate around a table
    add (philDisplay[5]) ;
    add (philDisplay[2]) ;
    add (philDisplay[4]) ;
    add (philDisplay[3]) ;
    add (l) ; add (b) ; add (bStall) ;

    b.addMouseListener (new MouseAdapter () {
      public void mouseClicked (MouseEvent e) {
        startOperating () ;
      }
    } ) ;

    bStall.addMouseListener (new MouseAdapter () {
      public void mouseClicked (MouseEvent e) {
        ceaseOperating () ;
      }
    } ) ;

    addWindowListener (new WindowAdapter () {
      public void windowClosing (WindowEvent e) {
        System.exit(0) ;
      }
    } ) ;

  }

  public void ceaseOperating () {
    mealTime = false ;
    for (int i = 1; i<=5 ; i++ ) {
      philosopherThread[i].interrupt() ;
    }

  }

  public void startOperating () {
    mealTime = true ;

    // Construct five instances of the philosopher objects and five chopsticks
    for (int i = 1; i<=5 ; i++ ) {
      chopsticks[i] = new Chopstick() ;
      philosophers[i] = new Philosopher ( philDisplay[i] , i) ;
      philosopherThread[i] = new Thread ( philosophers[i] ) ;
      philosopherThread[i].start() ;
    }

  }


  public static void main (String args[]) {

    FivePhil newFrame = new FivePhil () ;
    newFrame.setVisible(true) ;
  }





class Philosopher implements Runnable {

   PhilDisplay myDisplay ;
   int i, j ;

   public Philosopher (PhilDisplay me, int myNumber) {
      myDisplay = me ;
      i = j = myNumber ;
   }

   public void run () {

      while (mealTime) {

        myDisplay.think() ;  // start by thinking
        try {

          // Waits for a random time between 0 and 3 seconds
          double r = Math.random() * 3.0 ;
          Thread.sleep((long)(r * 1000)) ;

	  // gets left chopstick number, which can be 5 if philosopher = 1
          j = ((i - 1) == 0) ? (5) : (i - 1) ; 
          
	  // Tries to grab the lowest numbered chopstick of i and j
          // This prevents deadlock
          chopsticks[Math.min(i,j)].getChopstick() ;
          myDisplay.haveOneChopstick() ;  // ready to start eating...

          // Then tries to grab the other chopstick
          chopsticks[Math.max(i,j)].getChopstick() ;

          // Then eats for random time between 1 and 2 seconds
          myDisplay.eat () ;
          Thread.sleep((long)(r * 2000)) ;

          // Releases two chopsticks and starts again
          chopsticks[i].dropChopstick () ;
          chopsticks[j].dropChopstick () ;
          myDisplay.think() ;

        }  // end of try block

        catch (InterruptedException e) {
           myDisplay.think() ;
           return ;
        }

      }  // end of while loop

   }

}

class PhilDisplay extends Panel {
	   Label l ;
	   int thisPhilosopher ;

	   public PhilDisplay (int i) {
	      thisPhilosopher = i ;
	      l = new Label ("Philosopher waiting    : " + i ) ;
	      l.setForeground (Color.black) ;
	      add ( l ) ;
	   }

	   public void eat () {
	     l.setText ("I am eating: " + thisPhilosopher ) ;
	     l.setForeground (Color.red) ;
	   }

	   public void think () {
	     l.setText ("I am thinking: " + thisPhilosopher ) ;
	     l.setForeground (Color.black) ;
	   }

	   public void haveOneChopstick () {
	     l.setText ("I am ready to eat: " + thisPhilosopher ) ;
	     l.setForeground (Color.blue) ;
	   }

	}

	public class Chopstick {
		
		boolean chopstickHeld = false;
		
		public synchronized void dropChopstick (){
			chopstickHeld = false;
			notifyAll(); // chopstick is available
		}
		
		public synchronized void getChopstick () throws InterruptedException {
			while (chopstickHeld){
				wait();
			}
			chopstickHeld = true;
		}
		
	//	public synchronized void getChopstick () throws InterruptedException {
	//		if (!chopstickHeld)
	//			chopstickHeld = true; // chopstick is available
	//		else {
	//			//wait for the chopstick
	//			wait();
	//			chopstickHeld = true; //grab it!
	//		}
	//
	//	}
	
	}





}  // end of class FivePhil

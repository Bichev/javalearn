package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 15.05.12
 * Time: 16:27
 * To change this template use File | Settings | File Templates.
 */
public class InnerClassDemo {
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public InnerClassDemo() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven () {
        InnerEvenIterator iterator = new InnerEvenIterator();
        
        while (iterator.hasNext()){
            System.out.println(iterator.getNext() + " ");
        }
    }
    
    //Iterator implementation
    private class InnerEvenIterator {
        //start stepping through the array from the begining
        private int next = 0;
        
        public boolean hasNext() {
            return (next <= SIZE - 1);   
        }
        
        public int getNext() {
            int retValue = arrayOfInts[next];
            next += 2;
            return retValue;
        }        
    }
    
    public static void main (String... args){
        InnerClassDemo classDemo = new InnerClassDemo();
        classDemo.printEven();
    }
}

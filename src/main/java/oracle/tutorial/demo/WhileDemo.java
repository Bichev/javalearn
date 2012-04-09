package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 09.04.12
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */
public class WhileDemo {
    
    public static void main (String[] args) {
        int count = 1;

        //recursion
        while (count < 11) {
            System.out.println(count);
            count++;
        }

        count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count < 11);
        
//        while (true){
//            System.out.println("it's recursion");
//        }

//        for ( ; ; ) {
//            System.out.println("recursion");
//        }
    }
}

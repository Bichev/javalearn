package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 09.04.12
 * Time: 18:25
 * To change this template use File | Settings | File Templates.
 */
public class ForDemo {

    //        for ( ; ; ) {
//            System.out.println("recursion");
//        }

    public static void main (String[] args) {
        int[] statements = {1,2,3,4,5,6,7,8,9};

        //for Collections and Arrays
        //this recommended form whenever it possible!!!!!
        for (int item : statements) {
            System.out.println(item);
        }
    }
}

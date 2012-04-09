package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 09.04.12
 * Time: 18:31
 * To change this template use File | Settings | File Templates.
 */
public class BreakDemo {
    
    public static void main (String[] args) {
        int[] arrray = {1,2,3,4,5,6,7,8,9};
        int i = 0;
        int searchFor = 7;

        while (true) {
            System.out.println(i);
            if (arrray[i] == searchFor) {
                System.out.println(i);
                System.out.println(searchFor);
                break;
            }
            i++;
        }
    }
}

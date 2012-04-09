package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 09.04.12
 * Time: 18:46
 * To change this template use File | Settings | File Templates.
 */
public class BreakWithLabelDemo {
    
    public static void main (String[] args) {
        int[][] array = {
                {12, 15, 19},
                {35, 38, 39},
                {50, 55, 59}
        };

        int searchFor = 38;
        int i = 0;
        int j = 0;

        search:
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if (array[i][j] == searchFor) {    
                    System.out.println(array[i][j]);
                    //return;
                    break search;
            }
        }
        
    }
    }
}

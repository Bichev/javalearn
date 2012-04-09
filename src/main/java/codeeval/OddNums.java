package codeeval;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Vladimir Bichev
 * Date: 25.09.11
 * Time: 16:54
 */
public class OddNums {

    public static ArrayList<Integer> findOddsList (int minValue, int maxValue) {
        ArrayList<Integer> listOfOdds = new ArrayList<Integer>();
        int arrayIndex = 0;

        for (int i = minValue; i <= maxValue; i++) {
             if (!(0 == i % 2)) {
                 listOfOdds.add(arrayIndex, i);
                 arrayIndex++;
             }
        }
        return listOfOdds;
    }

    public static void main (String arg[]) {
        ArrayList<Integer> listOfOdds =  findOddsList(1,99);

        for (Iterator iterator = listOfOdds.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

    }
}

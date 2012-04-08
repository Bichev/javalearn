package codeeval;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Vladimir Bichev
 * Date: 21.09.11
 * Time: 15:45
 * Summ of Prime Numbers <   1000
 */
public class SumOfPrimeNumbers {

    private static int primeQantity = 1000;

    public static String findSumOfPrime (int primeQantity) {
        ArrayList<Integer> listOfPrimeNumbers  = new ArrayList<Integer>();

        for (int i = 2; i <= primeQantity; i++) {
            listOfPrimeNumbers.add(i-2,i);
        }

        for (int i = 2; i <= primeQantity; i++) {
            for (int j =2; j <= i/2; j++){
                if (i % j == 0) {
                    listOfPrimeNumbers.remove(listOfPrimeNumbers.indexOf(i));
                    break;
                }
            }
        }
        int summOfPrimeNumbers = 0;

        for (Iterator iterator = listOfPrimeNumbers.iterator(); iterator.hasNext();){
            summOfPrimeNumbers = summOfPrimeNumbers + (Integer) iterator.next();
        }

        return String.valueOf(summOfPrimeNumbers);
    }

    public static void main (String arg[]) {
        System.out.println(findSumOfPrime(primeQantity));
    }
}

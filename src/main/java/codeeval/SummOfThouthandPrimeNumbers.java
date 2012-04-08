package codeeval;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Vladimir Bichev
 * Date: 21.09.11
 * Time: 19:47
 */
public class SummOfThouthandPrimeNumbers {

    public static ArrayList<Integer> findListOfThouthandPrime() {

        int quantityOfPrimeNumbers = 0;

        ArrayList<Integer> listOfPrimeNumbers = new ArrayList<Integer>();

        long startTime = System.nanoTime();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            if (i > 3 ){
               boolean itIsPrime = true;
               // Should be optimize because division < i too mach ==>  division < 2*Math.sqrt(i) --- Perfomance is increase in 10 times!!!
               for (int division = 2; division < 2*Math.sqrt(i); division++) {
                   if (i % division == 0) {
                       itIsPrime = false;
                       break;
                   }
               }
               if (itIsPrime) {
                   listOfPrimeNumbers.add(quantityOfPrimeNumbers,i);
                   quantityOfPrimeNumbers++;
               }

            //2+3
            }  else if (i > 1 ) {
                listOfPrimeNumbers.add(quantityOfPrimeNumbers, i);
                quantityOfPrimeNumbers++;
            }

            //here we should stop; 999 because Array List start from [0]
            if (quantityOfPrimeNumbers > 999) {
                //perfomance test
                long endTime = System.nanoTime();
                long timeOdd = endTime - startTime;

                return listOfPrimeNumbers;

            }
        }

        return null;
    }

    public static String findSumOfThouthandPrime() {
        ArrayList<Integer> listOfPrimeNumbers = findListOfThouthandPrime();
        int sumOfThouthandPrimes = 0;
        if (listOfPrimeNumbers != null && listOfPrimeNumbers.size() > 0) {
            for (Iterator iterator = listOfPrimeNumbers.iterator(); iterator.hasNext();) {
                sumOfThouthandPrimes = sumOfThouthandPrimes + (Integer) iterator.next();
            }
        }

        return String.valueOf(sumOfThouthandPrimes);
    }

    private Double findDevisionNumber (int i) {

        double doub = Double.valueOf(String.valueOf(i));
        double eilerMaskeroniConstant =  0.57721566490153286060651209008240243104215933593992359880576723488486772677766467093694706329175;

        //Dirihle formula
        double dirihleResult = i*Math.log10(i) + (2*eilerMaskeroniConstant - 1) + 2*(Math.sqrt(i));

        return dirihleResult;
    }

    public static void main (String arg[]) {
        System.out.println(findSumOfThouthandPrime());
    }
}

package codeeval;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 20.09.11
 * Time: 22:15
 * To change this template use File | Settings | File Templates.
 */
public class PrimePalindrome {

    private static int palindromRangeMin = 0;
    private static int palindromRangeMax = 1000;
//    private  static  ArrayList<Integer> listOfPalindroms = new ArrayList<Integer>();

    public static String findBiggestPalindrom (int palindromRangeMin, int palindromRangeMax){

        int biggestPrimePalindrom = 0;
        String biggestPrimePalindromString = "";
        ArrayList<Integer> listOfPalindroms = new ArrayList<Integer>();
        ArrayList<Integer> listOfPrimePalindroms = new ArrayList<Integer>();

        //case when palindromRangeMax < 12
        if (palindromRangeMax <= 11) {
           switch (palindromRangeMax){
               case 11: biggestPrimePalindromString = String.valueOf(11); break;
               case 10: case 9: case 8: case 7: biggestPrimePalindromString = String.valueOf(7); break;
               case 6: case 5: biggestPrimePalindromString = String.valueOf(5); break;
               case 4: case 3: biggestPrimePalindromString = String.valueOf(3); break;
               case 2: biggestPrimePalindromString = String.valueOf(2); break;
               default: biggestPrimePalindromString = "Nothing"; break;
           }
        } else {
            //find all posible Palidroms in diapason and add them to the listOfPalindroms
            if (palindromRangeMax > 100 && palindromRangeMax  < 1001){

                for (int i = palindromRangeMin; i <= palindromRangeMax; i++) {
                    int numberFirstIndex = 0;
                    int numberLastIndex = String.valueOf(i).length() - 1;
                    char firstNumber = String.valueOf(i).charAt(numberFirstIndex);
                    char lastNumber = String.valueOf(i).charAt(numberLastIndex);
                    if (firstNumber == lastNumber) {
                       listOfPalindroms.add(i);
                    }
                }

            }else if (palindromRangeMax > 1000) {
                return "I don't find a solution for numbers more than 1000...as yet";
            } else {
                return "Nothing";
            }

            //find list Prime Palindroms
            if (listOfPalindroms != null && listOfPalindroms.size() > 0){
                listOfPrimePalindroms.addAll(listOfPalindroms);
                for (Iterator iterator = listOfPalindroms.iterator(); iterator.hasNext();){
                    int palindromForCheck = (Integer) iterator.next();
//                    universal case
//                    for (int i = 2; i < palindromForCheck; i++){
//                        //remove from listOfPalindroms not Prime numbers
//                        if (palindromForCheck % i == 0) {
//                            listOfPrimePalindroms.remove(listOfPrimePalindroms.indexOf(palindromForCheck));
//                            break;
//                        }
//                    }

                    //because 32*32 = 1024 then 31 is enough for palindromRangeMax = 1000
                    for (int i = 2; i < 31; i++){
                        //remove from listOfPalindroms not Prime numbers
                        if (palindromForCheck % i == 0) {
                            listOfPrimePalindroms.remove(listOfPrimePalindroms.indexOf(palindromForCheck));
                            break;
                        }
                    }
                }
                //get last number from listOfPalindroms
                biggestPrimePalindromString = String.valueOf(listOfPrimePalindroms.get(listOfPrimePalindroms.size() -1));
            }
        }


        return biggestPrimePalindromString;
    }


    public static void main (String arg[]) {
         System.out.println(findBiggestPalindrom(palindromRangeMin, palindromRangeMax));

//        findBiggestPalindrom(palindromRangeMin, palindromRangeMax);
//        for (Iterator iterator = listOfPalindroms.iterator(); iterator.hasNext();){
//            System.out.println(iterator.next());
//        }

    }
}

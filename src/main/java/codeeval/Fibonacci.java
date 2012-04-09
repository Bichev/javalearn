package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir Bichev
 * Date: 25.09.11
 * Time: 17:18
 */
public class Fibonacci {

    public static String  path = "C:/foo.txt";

    public static Integer findFibonacci (int fibonacciNumber, String path) {

        try{
            BufferedReader in = new BufferedReader(new FileReader(path));
             in.toString();
            //formula of Jacques Philippe Marie Binet
            double fibonacci = (Math.pow(((1+Math.sqrt(5))/2), fibonacciNumber) - Math.pow(((1-Math.sqrt(5))/2), fibonacciNumber))/Math.sqrt(5);
            String fibonacciToString = String.valueOf(fibonacci).substring(0, String.valueOf(fibonacci).indexOf("."));

        } catch (IOException e) {

        }
//        return Integer.valueOf(fibonacciToString);
        return 0;
    }

    public static void main (String arg []) {
        System.out.println(findFibonacci(40, path));
    }
}

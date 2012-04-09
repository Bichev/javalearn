package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 09.04.12
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 */
public class ContinueDemo {
    public static void main(String[] args) {

        String searchMe
                = "peter piper picked a " +
                "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " +
                numPs + " p's in the string.");
    }
}

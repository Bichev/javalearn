package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 09.04.12
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */
public class SwitchDemo {

        public static void main(String[] args) {

            int month = 8;
            String monthString;
            switch (month) {
                case 1:  monthString = "January";
                    break;
                case 2:  monthString = "February";
                    break;
                case 3:  monthString = "March";
                    break;
                case 4:  monthString = "April";
                    break;
                case 5:  monthString = "May";
                    break;
                case 6:  monthString = "June";
                    break;
                case 7:  monthString = "July";
                    break;
                case 8: monthString = "a" ;
                    break;
                case 9: monthString = "s";
                    break;
                default: monthString = "nein";
                    break;
            }
            System.out.println(monthString);
        }

}

package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 15.05.12
 * Time: 22:35
 * To change this template use File | Settings | File Templates.
 */
public class EnumDemoTest {
    EnumDemo.Day day;
    
    public EnumDemoTest (EnumDemo.Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs () {
        switch (day){
            case MONDAY:
                System.out.println("Monday are bad");
                break;
            case FRIDAY:
                System.out.println("Friday are better");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Best days");
                break;
            default:
                System.out.println("so-so");
                break;
        }
    }
    
    public static void main (String... args) {
        EnumDemo.Day[] days = EnumDemo.Day.values();

        EnumDemoTest firstDay = new EnumDemoTest(EnumDemo.Day.MONDAY);
        firstDay.tellItLikeItIs();

        EnumDemoTest secondDay = new EnumDemoTest(EnumDemo.Day.FRIDAY);
        secondDay.tellItLikeItIs();

        EnumDemoTest thirdDay = new EnumDemoTest(EnumDemo.Day.TUESDAY);
        thirdDay.tellItLikeItIs();

        for (EnumDemo.Day day : days) {
            System.out.println(day);
        }
    }
}

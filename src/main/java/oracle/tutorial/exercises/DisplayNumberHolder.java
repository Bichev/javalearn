package oracle.tutorial.exercises;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 14.05.12
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public class DisplayNumberHolder {
    private static NumberHolder aNumberHolder = new NumberHolder();
    
    public static void main (String... args) {
        aNumberHolder.anInt = 10;
        aNumberHolder.aFloat = 2.3f;
        System.out.println(aNumberHolder.anInt);
        System.out.println(aNumberHolder.aFloat);

    }
}

package oracle.tutorial.demo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 11.04.12
 * Time: 17:48
 * To change this template use File | Settings | File Templates.
 */
public class PassingReferenceData {
    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of
        // circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        // code to assign a new
        // reference to circle
        circle = new Circle(0, 0);
    }
    public static Circle myCircle = new Circle(5,5);

    public static void main (String... args){
        moveCircle(myCircle, 23, 56);
    }

}

package oracle.tutorial.oopdemo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 10.04.12
 * Time: 14:36
 * To change this template use File | Settings | File Templates.
 */
public class VehicleImpl implements Vehicle{
    private String colour;
    private int speed;
    private int gear;

    public VehicleImpl () {
        this(1,3,"blue");
    }

    public VehicleImpl (int speed, int gear) {
        this(speed, gear, "red");
    }
    
    public VehicleImpl (int startSpeed, int  startGear, String defColour) {
        setGear(startGear);
        setColour(defColour);
        setSpeed(startSpeed);
    }

//    public VehicleImpl () {
//        setGear(1);
//        setSpeed(55);
//        setColour("red");
//    }

    public void speedUp (int increment) {
        setSpeed(getSpeed() + increment);
//        speed += increment;
    }

    public void speedDown (int decrement){
        setSpeed(getSpeed() - decrement);
//        speed -= decrement;
    }

    public void gearUp (int increment){
        setGear(getGear() + increment);
//        gear += increment;
    }

    public void gearDown (int decrement){
        setGear(getGear() - decrement);
        gear -= decrement;
    }

    public Boolean checkActivity (int speed){
        return (speed > 0) ? true : false;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}

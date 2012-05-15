package oracle.tutorial.oopdemo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 10.04.12
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */
public class Car extends VehicleImpl{

    //as Enum
    private String drive;
    private static final int SPEED_LIMIT = 60;
    private int id;
    private static int numberOfCar = 0;

    //Example of Initializing for all Constructors
    {
        this.id = ++numberOfCar;
    }

    public Car (int startSpeed, int  startGear, String defColour, String drive) {
        super(startSpeed,startGear,defColour);
        this.drive = drive;
        //setDrive(driveType);
        //this.id = ++numberOfCar;
    }
    
    public Car (){
        super();
        //this.id = ++numberOfCar;
    }

    public Car (String... someString){  //Arbitaty Number - varargs
        super();
        
    }
    
    public int passagenrsCount (String... passanger) {
        return passanger.length;
    }

    public String checkSpeedLimit (int currentSpeed) {
        return currentSpeed > SPEED_LIMIT ? "Warning" : "OK";
    }
    
    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

}

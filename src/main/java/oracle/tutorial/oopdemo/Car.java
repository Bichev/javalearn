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
    
    public Car (int startSpeed, int  startGear, String defColour, String driveType) {
        super(startSpeed,startGear,defColour);
        setDrive(driveType);
    }
    
    public Car (){
        super();
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

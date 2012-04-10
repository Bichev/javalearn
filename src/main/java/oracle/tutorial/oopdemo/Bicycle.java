package oracle.tutorial.oopdemo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 10.04.12
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class Bicycle extends VehicleImpl {
    
    private String bikeType;
    
    public Bicycle (int startSpeed, int  startGear, String defColour, String typeOfBike) {
        super(startSpeed, startGear, defColour);
        setBikeType(typeOfBike);
    }



    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }
}

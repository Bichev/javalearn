package oracle.tutorial.concepts;

/**
 * Created by Vladimir Bichev
 * Date: 22.12.11
 * Time: 22:21
 */
public class Phone implements PhoneActivities{

    //States
    public String modelName;
    public int price;
    public boolean onCall;
    public String colour;
    public int weight;
    public boolean state;

    //Constants
    public static final String PHONE_AVAILABLE = "Available";
    public static final String PHONE_NOTAVAILABLE = "Not available";

    //Methods
    public String checkState(boolean onCall) {
        if (!onCall) {
            return PHONE_AVAILABLE;
        }
        return PHONE_NOTAVAILABLE;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void turnOn() {
        setState(true);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void turnOff() {
        setState(false);
        //To change body of implemented methods use File | Settings | File Templates.
    }


    //Getters and Setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}

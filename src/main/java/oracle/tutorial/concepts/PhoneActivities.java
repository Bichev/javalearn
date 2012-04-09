package oracle.tutorial.concepts;

/**
 * Created by Vladimir Bichev
 * Date: 22.12.11
 * Time: 22:25
 */
public interface PhoneActivities {
    public String checkState (boolean onCall);
    public void setPrice(int price);
    public void turnOn ();
    public void turnOff();
}

package oracle.tutorial.oopdemo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 10.04.12
 * Time: 14:22
 * To change this template use File | Settings | File Templates.
 */
public interface Vehicle {
    
    
    public void speedUp (int increment);
    public void speedDown (int decrement);
    public void gearUp (int increment);
    public void gearDown (int decrement);
    public void setColour (String colour);
    
    public Boolean checkActivity (int speed);
    
}

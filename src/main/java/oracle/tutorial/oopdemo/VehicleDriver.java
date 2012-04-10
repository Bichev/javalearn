package oracle.tutorial.oopdemo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 10.04.12
 * Time: 16:24
 * To change this template use File | Settings | File Templates.
 */
public class VehicleDriver {

    Car niva = new Car(10, 1, "black", "fullWD");
    Car kalina = new Car(20, 2, "yellow", "frontDrive");

    Bicycle mtb = new Bicycle(5, 5, "green", "mountain");

    VehicleImpl desna = new Bicycle(10, 1, "", "" ) ;

    VehicleImpl kamaz = new Car();  //get super() --> Vehical from Car by empty constructor

}

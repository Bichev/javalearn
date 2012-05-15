package oracle.tutorial.oopdemo;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 10.04.12
 * Time: 16:24
 * To change this template use File | Settings | File Templates.
 */
public class VehicleDriver {

    public  static Car niva = new Car(10, 1, "black", "fullWD");
    public  static Car kalina = new Car(20, 2, "yellow", "frontDrive");

    public  static Bicycle mtb = new Bicycle(5, 5, "green", "mountain");

    public  static VehicleImpl desna = new Bicycle(10, 1, "", "" ) ;

    public  static VehicleImpl kamaz = new Car();  //get super() --> Vehical from Car by empty constructor

    public  static Car someCar = new Car("","","","","","","","");
    
    public static int nivaPassangers = niva.passagenrsCount("adf","wef","wefef","wef","www");
    
    public static void main (String... args) {
        System.out.println(nivaPassangers);
        System.out.println(kamaz.getColour());
    }



}

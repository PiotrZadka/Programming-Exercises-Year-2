/**
 * The purpose of this program is to show examples of interface implementation
 * and forcing classes to use specific methods
 * @author Piotr Zadka
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {

        // Vehicle as interface type
        // Could also use specific class type like "Car" or "MotorBike" but this way i'm telling
        // that these two constructors are "Vehicles" as well.
        Vehicle c1 = new Car(6);
        Vehicle m1 = new MotorBike(5);


        System.out.println(c1.VehicleType()+" Tax: "+c1.TaxValue());
        System.out.println(m1.VehicleType()+" Tax: "+m1.TaxValue());

    }
}

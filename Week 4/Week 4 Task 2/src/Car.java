/**
 * Vehicle - Car class
 */

public class Car implements Vehicle {

    /**
     * @param age  = vehicle age
     * @param tax  = vehicle tax
     * @param type = vehicle type
     */

    int age;
    int tax = 25;
    String type;

    Car(int age) {

        this.age = age;
    }

    @Override
    public int TaxValue() {

        return age * tax;
    }

    public String VehicleType() {

        return type = "Car";
    }
}

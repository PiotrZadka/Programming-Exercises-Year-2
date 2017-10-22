/**
 * Vehicle - MotorBike class
 */

public class MotorBike implements Vehicle {

    /**
     * @param age  = vehicle age
     * @param tax  = vehicle tax
     * @param type = vehicle type
     */

    int age;
    int tax = 15;
    String type;

    MotorBike(int age){
        this.age = age;
    }


    @Override
    public int TaxValue() {

        return age * tax;
    }

    public String VehicleType(){

        return type = "MotorBike";
    }
}

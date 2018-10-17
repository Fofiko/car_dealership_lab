package vehicles;

import interfaces.IFuel;

public class Car extends Vehicle implements IFuel {

    private double engineSize;
    private String fuelType;

    public Car(double price, String colour, int numberOfDoors, String make, String model, double engineSize, String fuelType) {
        super(price, colour, numberOfDoors, make, model);
        this.engineSize = engineSize;
        this.fuelType = fuelType;

    }


    public String getFuelType() {
        return "Petrol";
    }
}

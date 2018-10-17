package vehicles;

import interfaces.IFuel;

public class HybridCar extends Vehicle implements IFuel {

    private double engineSize;
    private String fuelType;

    public HybridCar(double price, String colour, int numberOfDoors, String make, String model, double engineSize, String fuelType) {
        super(price, colour, numberOfDoors, make, model);
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return "petrol";
    }
}

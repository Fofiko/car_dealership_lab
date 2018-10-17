package vehicles;

import interfaces.ICharge;

public class ElectricCar extends Vehicle implements ICharge {

    int chargeLevel;

    public ElectricCar(double price, String colour, int numberOfDoors, String make, String model, int chargeLevel) {
        super(price, colour, numberOfDoors, make, model);
        this.chargeLevel = chargeLevel;
    }

    @Override
    public int getChargeLevel() {
        return chargeLevel;
    }
}

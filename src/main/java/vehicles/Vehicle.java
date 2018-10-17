package vehicles;

public abstract class Vehicle {

    private double price;
    private String colour;
    private int numberOfDoors;
    private String make;
    private String model;

    public Vehicle(double price, String colour, int numberOfDoors, String make, String model) {
        this.price = price;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
        this.make = make;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

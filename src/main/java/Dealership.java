import interfaces.ICharge;
import interfaces.IFuel;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<IFuel>petrols;
    private ArrayList<ICharge>electrics;

    public Dealership(ArrayList<IFuel> petrols, ArrayList<ICharge> electrics){
        this.petrols = new ArrayList<>();
        this.electrics = new ArrayList<>();
    }

    public ArrayList<IFuel> getPetrolCars() {
        return petrols;
    }

    public void addPetrolCar(IFuel petrol){

        this.petrols.add(petrol);
    }

    public void addElectricCar(ICharge electric){
        this.electrics.add(electric);
    }

    public ArrayList<ICharge> getElectricCars() {
        return electrics;
    }
}

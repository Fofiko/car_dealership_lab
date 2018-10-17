import interfaces.ICharge;
import interfaces.IFuel;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.HybridCar;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ElectricCar electricCar;
    HybridCar hybridCar;
    Car car;
    Car car2;

    @Before
    public void before() {
        electricCar = new ElectricCar(300.30, "white", 5, "Audi", "A3", 5);
        hybridCar = new HybridCar(200.20, "white", 5, "Audi", "A3", 1.4, "petrol");
        car = new Car(1000.50, "white", 5, "Toyota", "Crown", 1.6, "petrol");
        car2 = new Car(2000.50, "red", 3, "Renault", "Megane", 1.6, "diesel");

        ArrayList<ICharge> electrics = new ArrayList<>();
        ArrayList<IFuel> petrols = new ArrayList<>();

        dealership = new Dealership(petrols,electrics);

    }

    @Test
    public void numberOfPetrolCars(){
        dealership.addPetrolCar(car);
        dealership.addPetrolCar(car2);
        dealership.addPetrolCar(hybridCar);
        assertEquals(3, dealership.getPetrolCars().size());
    }

    @Test
    public void numberOfElectricCars(){
        dealership.addElectricCar(electricCar);
        assertEquals(1, dealership.getElectricCars().size());
    }
}

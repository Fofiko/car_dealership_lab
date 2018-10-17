import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before() {
        hybridCar = new HybridCar(200.20, "white", 5, "Audi", "A3", 1.4, "petrol");
    }

    @Test
    public void hasPrice(){
        assertEquals(200.20, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void canChangePrice(){
        hybridCar.setPrice(300.00);
        assertEquals(300.00, hybridCar.getPrice(), 0.01);

    }

    @Test
    public void hasColour(){
        assertEquals("white", hybridCar.getColour());
    }

    @Test
    public void canChangeColour(){
        hybridCar.setColour("red");
        assertEquals("red", hybridCar.getColour());
    }

    @Test
    public void hasNumberOfDoors(){
        assertEquals(5, hybridCar.getNumberOfDoors());

    }

    @Test
    public void hasMake(){
        assertEquals("Audi", hybridCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("A3", hybridCar.getModel());

    }

    @Test
    public void checkFuelType(){
        assertEquals("petrol", hybridCar.getFuelType());
    }

}

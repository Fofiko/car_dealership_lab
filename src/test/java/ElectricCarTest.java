import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new ElectricCar(300.30, "white", 5, "Audi", "A3", 5);
    }

    @Test
    public void hasPrice(){
        assertEquals(300.30, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canChangePrice(){
        electricCar.setPrice(440.00);
        assertEquals(440.00, electricCar.getPrice(), 0.01);

    }

    @Test
    public void hasColour(){
        assertEquals("white", electricCar.getColour());
    }

    @Test
    public void canChangeColour(){
        electricCar.setColour("red");
        assertEquals("red", electricCar.getColour());
    }

    @Test
    public void hasNumberOfDoors(){
        assertEquals(5, electricCar.getNumberOfDoors());

    }

    @Test
    public void hasMake(){
        assertEquals("Audi", electricCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("A3", electricCar.getModel());

    }
    
}

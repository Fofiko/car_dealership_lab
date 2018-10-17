import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car(1000.50, "white", 5, "Toyota", "Crown", 1.6, "petrol");
    }

    @Test
    public void hasPrice(){
        assertEquals(1000.50, car.getPrice(), 0.01);
    }

    @Test
    public void canChangePrice(){
        car.setPrice(500.00);
        assertEquals(500.00, car.getPrice(), 0.01);

    }

    @Test
    public void hasColour(){
        assertEquals("white", car.getColour());
    }

    @Test
    public void canChangeColour(){
        car.setColour("red");
        assertEquals("red", car.getColour());
    }

    @Test
    public void hasNumberOfDoors(){
        assertEquals(5, car.getNumberOfDoors());

    }

    @Test
    public void hasMake(){
        assertEquals("Toyota", car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Crown", car.getModel());

    }
}

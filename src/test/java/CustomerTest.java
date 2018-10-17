import dealshipComponents.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Sally", 500.0);
    }

    @Test
    public void getCustomerName(){
        assertEquals("Sally", customer.getName());
    }

    @Test
    public void getCustomerWallet(){
        assertEquals(500.0, customer.getWallet(),1);
    }

}

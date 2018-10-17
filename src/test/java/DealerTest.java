import dealshipComponents.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer("Bob");
    }

    @Test
    public void getName(){
        assertEquals("Bob", dealer.getName());
    }
}



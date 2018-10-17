import dealshipComponents.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(100);
    }

    @Test
    public void tillHasBalance(){
        assertEquals(100, till.getBalance(),1);
    }
}

package airCondionalTest;


import airConditional.Ac;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AcTest {

    @Test
    public void testThatAcIsOff(){
        Ac ac = new Ac();
        assertFalse(ac.isOn);

    }


    @Test
    public void testThatAcIsOn(){
        Ac ac = new Ac();
        ac.turnOn();
        assertTrue(ac.isOn);

    }
}

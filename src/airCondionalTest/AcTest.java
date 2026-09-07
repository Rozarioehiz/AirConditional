package airCondionalTest;


import airConditional.Ac;
import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testThatWhenTempsIsincreasedItIncrease(){
        Ac ac = new Ac();
        int actual = ac.getSpeed();
        int expected = 0;
        assertEquals(actual, expected);


        
    }
}

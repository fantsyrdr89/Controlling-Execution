package armstrong.alexandra;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandraarmstrong on 1/12/17.
 */
public class SumoftheNumbersTest {

    /*@Test
    public void askForInputTest() {
        int expected = 5;
        int actual = SumoftheNumbers.askForInput();
        assertEquals(expected, actual);
    }*/ //Can't test scanner input

    @Test
    public void sumNumbersTest(){
        int expected = 15;
        int actual = SumoftheNumbers.sumNumbers(5);
        assertEquals(expected, actual);
    }
}
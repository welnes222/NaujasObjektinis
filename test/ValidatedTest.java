import org.junit.Test;


import static org.junit.Assert.*;

public class ValidatedTest {

    @Test
    public void sumIntTwoNegativesTest(){
        int a = -10;
        int b = -5;
        int result = Validated.sumInt(a, b);
        int expected = -15;
        assertEquals(expected, result);
    }
    @Test
    public void sumIntTwoPositivesTest(){
        int a = 20;
        int b = 18;
        int result = Validated.sumInt(a, b);
        int expected = -15;
        assertEquals(expected, result);
    }

}
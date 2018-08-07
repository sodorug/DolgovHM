package tests;

import oopCalc.Multiply;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultiplyTest {
    private Multiply multiply;
    private int a = (int) (Math.random()*10);
    private int b = (int) (Math.random()*10);
    @BeforeMethod
    public void setUp() {
        multiply = new Multiply();
    }

    @Test
    public void testCalc() {
        assertEquals(multiply.calc(a,b),a*b);
    }
}
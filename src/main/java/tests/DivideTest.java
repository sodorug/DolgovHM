package tests;

import oopCalc.Divide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DivideTest {
    private Divide divide;
    private int a = (int) (Math.random()*10);
    private int b = (int) (Math.random()*10);
    @BeforeMethod
    public void setUp() {
        divide = new Divide();
    }

    @Test
    public void testCalc() {
        assertEquals(divide.calc(a,b),a/b);
    }
}
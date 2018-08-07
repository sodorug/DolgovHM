package tests;

import oopCalc.Subtract;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SubtractTest {
    private Subtract subtract;
    private int a = (int) (Math.random()*10);
    private int b = (int) (Math.random()*10);
    @BeforeMethod
    public void setUp() {
        subtract = new Subtract();
    }

    @Test
    public void testCalc() {
        assertEquals(subtract.calc(a,b),a-b);
    }
}
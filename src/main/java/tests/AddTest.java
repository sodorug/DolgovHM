package tests;

import oopCalc.Add;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddTest {
  private Add add;
  private int a = (int) (Math.random()*10);
  private int b = (int) (Math.random()*10);
  @BeforeClass
  public void setUp(){
      add = new Add();
  }
    @Test
    public void testCalc() {
        assertEquals(add.calc(a,b),a+b);
    }
}
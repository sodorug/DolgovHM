package oopCalc;

import java.io.IOException;

public class Divide implements CalcIt {
    public Divide() {
    }

    public int calc(int a, int b) {
        int res = 0;
        try {
            res = a / b;
        }
        catch (ArithmeticException exc){
            System.out.println("ошибка: на ноль делить нельзя.");

        }finally {
            return res;
        }
    }

}

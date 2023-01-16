package main.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
     void summ()
    {
        int a=2;
        int b=67;
        int result=69;
        assertEquals(new main.java.Calculator().summ(a,b),result);
    }

    @org.junit.jupiter.api.Test
    void minus()
    {
        int a=2;
        int b=67;
        int result=69;
        assertEquals(new main.java.Calculator().summ(a,b),result);
    }

    @org.junit.jupiter.api.Test
    void mult() {
        int a=20;
        int b=20;
        int result=400;
        assertEquals(new main.java.Calculator().mult(a,b),result);
    }

    @org.junit.jupiter.api.Test
    void divide()
    {
        int a=30;
        int b=15;
        int result=2;
        assertEquals(new main.java.Calculator().divide(a,b),result);
    }
}
package main.java;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void fake()
    {
        Scanner cin=new Scanner(System.in);
        String k;
        k=cin.next();
        if(k =="*" || k =="+" || k=="-" || k=="/") {
            assertEquals(new Facade().fake());
        }
    }


    private void assertEquals(String fake)
    {
        Scanner cin=new Scanner(System.in);
        String k;
        k=cin.next();

        if(k =="*" || k =="+" || k=="-" || k=="/")
        {
            k.equals(fake);
        }
    }
}
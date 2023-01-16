package main.java;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner cin=new Scanner(System.in);
        var facade = new Facade();
        String k=cin.next();
        System.out.println(facade.summ(2,4));
        System.out.println(facade.mult(5,4));
        System.out.println(facade.minus(2,4));
        System.out.println(facade.divide(13456,678654));

    }
}
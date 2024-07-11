package com.mehmetture.lib;

public class Main {

    public static void main(String[] args) {

        double age = 20;

        System.out.println( age * 15 );
        System.out.println( age / 3 );

        double pi = 3.14;
        double r = 7;

        double alan = pi*r*r;
        double hacim = (4.0/3)*pi*r*r*r;

        System.out.println("ALAN: " + alan);

        System.out.println("HACİM: " + hacim);


        boolean isAlive = true;
        isAlive = false;

        System.out.println(isAlive);

        final int myInteger = 15;

        System.out.println("myInteger: " + myInteger);


    }
}
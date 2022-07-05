package com.company.app;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calc = new Calculator();

        System.out.println("3+2="+calc.add(3,2));
        System.out.println("3*2="+calc.multiply(3,2));
    }
}

package com.demo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int x = 5;
        int y = 3;
        int result = calculator.add(x, y);

        System.out.println("Adding " + x + " + " + y + " = " + result);
    }
}

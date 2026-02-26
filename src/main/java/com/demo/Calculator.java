package com.demo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    /**
     * +++ This is custome java dock for class/method/field +++
     *
     * Subtracts the second operand from the first operand.
     *
     * @param  a  the minuend value
     * @param  b  the subtrahend value to subtract from {@code a}
     * @return    the result of {@code a - b}
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int x = 5;
        int y = 3;
        int result = calculator.add(x, y);

        System.out.println("Adding " + x + " + " + y + " = " + result);
    }
}

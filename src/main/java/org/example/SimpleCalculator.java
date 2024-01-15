package org.example;

public class SimpleCalculator {

    public int add(int x , int y) {
        return x + y;
    }


    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }


}

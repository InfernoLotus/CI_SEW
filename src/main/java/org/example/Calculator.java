package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) throw new DivideByZeroException();
        return a / b;
    }
    /*HAEI*/
    /*Oida, des kann I ned glauben wieso dieser t.. es nicht akzeptiert.*/

    public int multiply(int a, int b) {
        return a * b;
    }

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        return Math.sqrt(number);
    }
}
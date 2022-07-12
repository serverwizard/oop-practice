package org.example.calculator.domain;

public class Calculator {
    public static int calculate(PositiveNumber num1, String operator, PositiveNumber num2) {
        return ArithmeticOperator.calculate(num1.toInt(), operator, num2.toInt());
    }
}

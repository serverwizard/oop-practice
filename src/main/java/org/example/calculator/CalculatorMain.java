package org.example.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int operand1 = sc.nextInt();

        System.out.println("연산자를 입력하세요.");
        String operator = String.valueOf(sc.next().charAt(0));

        System.out.println("숫자를 입력하세요.");
        int operand2 = sc.nextInt();

        System.out.println(calculate(operand1, operator, operand2));
    }

    public static int calculate(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                return divide(num1, num2);
            default:
                throw new IllegalArgumentException("올바른 사칙연산이 아닙니다.");
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}

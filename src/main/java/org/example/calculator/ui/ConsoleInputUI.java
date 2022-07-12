package org.example.calculator.ui;

import java.util.Scanner;

public class ConsoleInputUI {
    private static final Scanner sc = new Scanner(System.in);

    public static int enterOperand() {
        System.out.println("숫자 입력: ");
        return sc.nextInt();
    }

    public static String enterOperator() {
        System.out.println("연산자 입력: ");
        return String.valueOf(sc.next().charAt(0));
    }
}

package org.example.hr.ui.console;

import java.util.Scanner;

public class ConsoleInputUI {
    private static final Scanner sc = new Scanner(System.in);

    public static String enterName() {
        System.out.println("이름 입력: ");
        return sc.nextLine();
    }

    public static String enterNo() {
        System.out.println("사번 입력: ");
        return sc.nextLine();
    }

    public static String socialSecurityNumber() {
        System.out.println("주민번호 입력: ");
        return sc.nextLine();
    }
}

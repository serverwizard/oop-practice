package org.example.hr.ui.console;

import org.example.hr.service.dto.EmployeeCreatedResponse;

public class ConsoleOutputUI {

    public static void printResult(EmployeeCreatedResponse response) {
        System.out.println("조회 결과: " + response);
    }
}

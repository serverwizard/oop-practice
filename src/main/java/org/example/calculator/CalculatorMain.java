package org.example.calculator;

import org.example.calculator.domain.Calculator;
import org.example.calculator.domain.PositiveNumber;
import org.example.calculator.ui.ConsoleInputUI;
import org.example.calculator.ui.ConsoleOutputUI;

public class CalculatorMain {

    public static void main(String[] args) {
        PositiveNumber operand1 = new PositiveNumber(ConsoleInputUI.enterOperand());
        String operator = ConsoleInputUI.enterOperator();
        PositiveNumber operand2 = new PositiveNumber(ConsoleInputUI.enterOperand());

        int result = Calculator.calculate(operand1, operator, operand2);

        ConsoleOutputUI.printResult(result);
    }
}

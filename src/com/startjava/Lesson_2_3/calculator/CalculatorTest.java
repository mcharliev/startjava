package Lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        calculator.answer = "yes";
        while (calculator.answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            calculator.num1 = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
            calculator.sign = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            calculator.num2 = scanner.nextInt();
            calculator.operation();
            calculator.answer = scanner.nextLine();
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            calculator.answer = scanner.nextLine();
            while (!calculator.answer.equals("yes") && !calculator.answer.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                calculator.answer = scanner.nextLine();
            }
        }
    }
}




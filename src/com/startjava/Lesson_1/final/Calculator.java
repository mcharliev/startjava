package Lesson1;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        int result = 1;
        char sign = ')';
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        } else if (sign == '^') {
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else {
            System.out.println("Операция не распознана. Повторите ввод.");
            return;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}





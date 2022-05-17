package Lesson2;

public class Calculator {
    int num1;
    int num2;
    private int result = 1;
    char sign;
    String answer;

    public void operation() {
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                return;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}








package Lesson1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java");

        int age = 18;
        if (age > 20) {
            System.out.println("Person over 20 years old");
        } else {
            System.out.println("Person under 20 years old");
        }
        boolean male = false;
        if (!male) {
            System.out.println("Female");
        }
        double heightInMeters = 1.6;
        if (heightInMeters < 1.80) {
            System.out.println("Person is above average height");
        } else {
            System.out.println("Person is average height");
        }
        char firstLetterOfName = "Michael".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Person's name is Marat");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Person's name is Ivan");
        } else {
            System.out.println("Person's name is Pavel");
        }

        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа");

        int x = 7;
        int y = 21;
        if (x < y) {
            System.out.println("Минимальное число " + x);
            System.out.println("Максимальное число " + y);
        } else {
            System.out.println("Минимальное число " + y);
            System.out.println("Максимальное число " + x);
        }

        //3. Работа с числом
        System.out.println("\n2. Работа с числом");

        x = 32;
        if ((x % 2 == 0) && (x > 0)) {
            System.out.println(x + " - Четное положительное число");
        } else if ((x % 2 == 0) && (x < 0)) {
            System.out.println(x + " - Четное отрицательное число");
        } else if ((x % 2 != 0) && (x > 0)) {
            System.out.println(x + " - Нечетное положительное число");
        } else if ((x % 2 != 0) && (x < 0)) {
            System.out.println(x + " - Нечетное отрицательное число");
        } else {
            System.out.println("Число = " + x);
        }

        //4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах");

        int srcNum1 = 123;
        int srcNum2 = 123;
        int firstDigitNum1 = srcNum1 / 100;
        int secondDigitNum1 = ((srcNum1 / 10) % 10);
        int thirdDigitNum1 = srcNum1 % 10;
        int firstDigitNum2 = srcNum2 / 100;
        int secondDigitNum2 = ((srcNum2 / 10) % 10);
        int thirdDigitNum2 = srcNum2 % 10;
        if (firstDigitNum1 == firstDigitNum2) {
            System.out.println("Первый разряд числа x = " + firstDigitNum1);
            System.out.println("Первый разряд числа y = " + firstDigitNum2);
        }  if (secondDigitNum1 == secondDigitNum2) {
            System.out.println("Второй разряд числа x = " + secondDigitNum1);
            System.out.println("Второй разряд числа y = " + secondDigitNum2);
        } if (thirdDigitNum1 == thirdDigitNum2) {
            System.out.println("Третий разряд числа x = " + thirdDigitNum1);
            System.out.println("Третий разряд числа y = " + thirdDigitNum2);
        } else {
            System.out.println("Одинаковых цифр в разрядах чисел x и y не найдено ");
        }

        //5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");

        char code = '\u005A';
        if ((code >= 'a' && code <= 'z') || (code >= 'A' && code <= 'Z')) {
            System.out.println("Код является буквой " + code);
        } else if (code >= '0' && code <= '9') {
            System.out.println("Код является цифрой " + code);
        } else {
            System.out.println("Код является символом " + code);
        }

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");

        int sumDeposit = 300000;
        double accruedInterest = 0;

        if (sumDeposit < 100000) {
            accruedInterest = 0.05;
        } else if ((sumDeposit >= 100000) && (sumDeposit < 300000)) {
            accruedInterest = 0.07;
        } else if (sumDeposit >= 300000) {
            accruedInterest = 0.1;
        }
        accruedInterest = (sumDeposit * accruedInterest);
        System.out.println("Сумма вклада = " + sumDeposit + " начисленный процент = " + (accruedInterest) + " Итоговая сумма = " + (sumDeposit + accruedInterest));

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");

        int pointsOfHistory = 59;
        int pointOfProgramming = 91;
        int scoreOfHistory = 0;
        int scoreOfProgramming = 0;

        if (pointsOfHistory <= 60) {
            System.out.println("Оценка по истории  = " + (scoreOfHistory = 2));
        } else if ((pointsOfHistory > 60) && (pointsOfHistory < 73)) {
            System.out.println("Оценка по истории  = " + (scoreOfHistory = 3));
        } else if ((pointsOfHistory > 73) && (pointsOfHistory < 91)) {
            System.out.println("Оценка по истории  = " + (scoreOfHistory = 4));
        } else if (pointsOfHistory >= 91) {
            System.out.println("Оценка по истории  = " + (scoreOfHistory = 5));
        }
        if (pointOfProgramming <= 60) {
            System.out.println("Оценка по программированию  = " + (scoreOfProgramming = 2));
        } else if ((pointOfProgramming > 60) && (pointOfProgramming < 73)) {
            System.out.println("Оценка по программированию  = " + (scoreOfProgramming = 3));
        } else if ((pointOfProgramming > 73) && (pointOfProgramming < 91)) {
            System.out.println("Оценка по программированию  = " + (scoreOfProgramming = 4));
        } else if (pointOfProgramming >= 91) {
            System.out.println("Оценка по программированию  = " + (scoreOfProgramming = 5));
        }
        System.out.println("Среднее значение оценок по предметам = " + (scoreOfHistory + scoreOfProgramming) / 2);
        System.out.println("Среднее значение баллов по предметам = " + (pointsOfHistory + pointOfProgramming) / 2);

        //8. Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка)");

        int rentOfRoom = 5000;
        int coastOfProduct = 9000;
        int averageRevenueInMonth = 15000;
        int profitOrLoss = (averageRevenueInMonth - rentOfRoom - coastOfProduct) * 12;
        if (profitOrLoss > 0) {
            System.out.println("Прибыль в год составляет + " + profitOrLoss);
        } else {
            System.out.println("Убыток  в год составляет - " + profitOrLoss);
        }

        //9.Определение существования треугольника
        System.out.println("\n9.Определение существования треугольника");

        int sideA = 3;
        int sideB = 4;
        int sideC = 5;

        if ((sideA + sideB > sideC) || (sideB + sideC > sideA) || (sideC + sideA > sideB)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
        if ((sideC > sideA) && (sideC > sideB)) {
            System.out.println("Значение гипотинузы  = " + sideC + ", так как  длина гипотинузы всегда больше длины любого катета");
            System.out.println("Первый катет = " + sideB + " Второй катет = " + sideA);
        } else if ((sideA > sideB) && (sideA > sideC)) {
            System.out.println("Значение гипотинузы  = " + sideA + ", так как  длина гипотинузы всегда больше длины любого катета");
            System.out.println("Первый катет = " + sideB + " Второй катет = " + sideC);
        } else if ((sideB > sideA) && (sideB > sideC)) {
            System.out.println("Значение гипотинузы  = " + sideB + ", так как  длина гипотинузы всегда больше длины любого катета");
            System.out.println("Первый катет = " + sideA + " Второй катет = " + sideC);
        }
        System.out.println("Площадь треугольника = " + (sideA * sideB) * 0.5);
        System.out.println("|" + "\\");
        System.out.println("|" + " \\");
        System.out.println("|" + "  \\");
        System.out.println("|___" + "\\");

        //10. Подсчет количества банкнот
        System.out.println("\n10.Подсчет количества банкнот");

        int srcNumber = 567;
        int banknoteX = 50;
        int banknoteY = 10;
        int banknoteZ = 1;
        int z = 0;

        if ((srcNumber / banknoteX) > 0) {
            x = srcNumber / 50;
            System.out.println(x);
        }
        if ((srcNumber / banknoteY) > 0) {
            y = x % 10;
            System.out.println(y);
        }
        if ((srcNumber / banknoteZ) > 0) {
            z = (srcNumber % 10);
            System.out.println(z);
        }
        System.out.println("Сумму 567 можно получить с помощью " + x + " банкнот номинала 50, " + y + " банкноты номинала 10, " + z + " банкнот номинала 1");
        System.out.println((banknoteX * x) + (banknoteY * y) + (banknoteZ * z));
    }
}







































package Lesson1;

public class CyclesTheme {
    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");

        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("Сумма четных чисел = " + sumEven);
        System.out.println("Сумма нечетных чисел = " + sumOdd);

        //2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min\n");

        int x = 10;
        int y = -1;
        int z = 5;
        int max = 0;

        if ((x > y) && (x > z)) {
            max = x;
        } else if ((y > x) && (y > z)) {
            max = y;
        } else {
            max = z;
        }
        int min = 0;
        if ((x < y) && (x < z)) {
            min = x;
        } else if ((y < x) && (y < z)) {
            min = y;
        } else {
            min = z;
        }
        for (i = max - 1; i > min; i--) {
            System.out.printf("%2d", i);
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int srcNum = 1234;
        int digit = 0;
        int sumDigits = 0;
        while (srcNum > 0) {
            digit = srcNum % 10;
            System.out.print(digit);
            srcNum /= 10;
            sumDigits += digit;
        }
        System.out.println(" Сумма цифр числа = " + sumDigits);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        int j;
        for (i = 1, j = 1; i < 25; i += 2, j++) {
            System.out.printf("%4d", i);
            if (j % 5 == 0) {
                System.out.println();
            }
        }
        while (j < i) {
            System.out.printf("%4d", 0);
            j += 5;
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность\n");

        srcNum = 3141591;
        int countUnits = 0;
        while (srcNum > 0) {
            if (srcNum % 10 == 1) {
                countUnits++;
            }
            srcNum /= 10;
        }
        if (countUnits % 2 == 0) {
            System.out.println("Количество единиц четное = " + countUnits);
        } else {
            System.out.println("Количество единиц нечетное = " + countUnits);
        }

        //6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли\n");

        for (i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        i = 0;
        while (i < 5) {
            System.out.println();
            j = 5;
            while (j > i) {
                System.out.print("#");
                j--;
            }
            i++;
        }
        System.out.println("\n");
        i = 0;
        do {
            System.out.println("$");
            i++;
            if (i == 1) {
                System.out.print("$");
            }
            if (i == 2) {
                System.out.print("$$");
            }
            if (i == 3) {
                System.out.print("$");
            }
        }
        while (i < 5);

        //7. Отображение ASCII-символов
        System.out.println("\n7.Отображение ASCII-символов\n");

        System.out.println(" DEX Char");
        for (i = 64; i <= 90; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%3c\n", i, (char) i);
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        srcNum = 12321;
        int srcNumCopy = srcNum;
        int revSrcNum = 0;
        while (srcNumCopy != 0) {
            revSrcNum = revSrcNum * 10 + srcNumCopy % 10;
            srcNumCopy /= 10;
        }
        if (revSrcNum == srcNum) {
            System.out.println("Число " + srcNum + " является палиндромом");
        } else {
            System.out.println("Число " + srcNum + " не является палиндромом");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9.Определение, является ли число счастливым\n");

        srcNum = 721271;
        int srcNum1 = srcNum / 1000;
        int srcNum2 = srcNum;
        int sumRightDigits = 0;
        int rightNums = 0;
        int leftNums = 0;
        int sumLeftDigits = 0;
        while (srcNum1 > 0) {
            rightNums = srcNum % 10;
            sumRightDigits += rightNums;
            srcNum /= 10;
            leftNums = srcNum1 % 10;
            sumLeftDigits += leftNums;
            srcNum1 /= 10;
        }
        if (sumRightDigits == sumLeftDigits) {
            System.out.println("Число " + srcNum2 + " является счастливым");
        } else {
            System.out.println("Число " + srcNum2 + " не является счастливым");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        System.out.print(" |");
        for (i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n_|________________________");
        for (i = 2; i < 10; i++) {
            System.out.print("\n" + i + "|");
            for (j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
        }
    }
}



























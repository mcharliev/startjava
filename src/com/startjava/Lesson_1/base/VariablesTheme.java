package Lesson1;

public class VariablesTheme {

    public static void main(String[] args) {
        //1. Создание переменных и вывод их значений на консоль
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");

        byte cpuNumber = 7;
        short cpuCores = 6;
        int cpuThreads = 4;
        long amountOfRam = 32;
        float baseFrequency = 3.2f;
        double boostFrequency = 3.6;
        char cpuAbbreviation = 'i';
        boolean embeddedOptionsAvailable = true;
        System.out.println(cpuNumber);
        System.out.println(cpuCores);
        System.out.println(cpuThreads);
        System.out.println(amountOfRam);
        System.out.println(baseFrequency);
        System.out.println(boostFrequency);
        System.out.println(cpuAbbreviation);
        System.out.println(embeddedOptionsAvailable);

        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");

        double productCostX = 100;
        double productCostY = 200;
        double discount = 0.11;
        double amountDiscount = ((productCostX + productCostY) * discount);
        System.out.println(amountDiscount);
        double totalDiscountPrice = ((productCostX + productCostY) - amountDiscount);
        System.out.println(totalDiscountPrice);

        // 3. Вывод на консоль слова JAVA
        System.out.println("\n3. Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // 4. Отображение min и max значений числовых типов данных
        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807l;

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);
        System.out.println(++maxByte);
        System.out.println(++maxShort);
        System.out.println(++maxInt);
        System.out.println(++maxLong);
        System.out.println(--maxByte);
        System.out.println(--maxShort);
        System.out.println(--maxInt);
        System.out.println(--maxLong);

        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");

        float number1 = 5.99f;
        double number2 = 6.32;
        System.out.println(number1);
        System.out.println(number2);
        double number3;
        number3 = number1;
        number1 = (float) number2;
        number2 = number3;
        System.out.println(number1);
        System.out.println(number2);

        //6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");

        int numberSign = 35;
        System.out.println(numberSign + "-" + (char) numberSign);
        int ampersand = 38;
        System.out.println(ampersand + "-" + (char) ampersand);
        int atSign = 64;
        System.out.println(atSign + "-" + (char) atSign);
        int caret = 94;
        System.out.println(caret + "-" + (char) caret);
        int underscore = 95;
        System.out.println(underscore + "-" + (char) underscore);

        //7. Произведение и сумма цифр числа
        System.out.println("\n 7. Произведение и сумма цифр числа");

        int srcNumber = 345;
        int x = srcNumber % 10; //=5
        int y = (srcNumber / 10) % 10; //=4
        int z = srcNumber / 100; //=3
        int productOfNumbers = x * y * z;
        System.out.println("произведение цифр = " + productOfNumbers);
        int sumOfNumbers = x + y + z;
        System.out.println("сумма цифр = " + sumOfNumbers);

        // 8. Вывод на консоль ASCII-арт Дюка
        System.out.println("\n8.Вывод на консоль ASCII-арт Дюка");

        String slash = "/";
        String backSlash = "\\";
        String space = " ";
        String dash = "_";
        String lParentheses = "(";
        String rParentheses = ")";
        System.out.println(space + space + space + space + slash + space + backSlash);
        System.out.println(space + space + space + slash + space + space + space + backSlash);
        System.out.println(space + space + slash + dash + dash + lParentheses + space + rParentheses + backSlash);
        System.out.println(space + slash + space + space + space + space + space + space + space + backSlash);
        System.out.println(slash + dash + dash + dash + dash + space + slash + backSlash + dash + dash + backSlash);

        // 9. Отображение количества сотен, десятков и единиц числа
        System.out.println("\n9.Отображение количества сотен, десятков и единиц числа");

        srcNumber = 123;
        int hundredths = srcNumber / 100;
        int tenths = ((srcNumber / 10) % 10);
        int units = srcNumber % 10;
        System.out.println("Количество сотен: " + hundredths);
        System.out.println("Количество десятков: " + tenths);
        System.out.println("Количество единиц: " + units);

        // 10. Преобразование секунд
        System.out.println("\n10.Преобразование секунд");

        int time = 86399;
        int hours = time / 3600;
        int min = time / 60 % 60;
        int sec = time % 60;
        System.out.println(hours + ":" + min + ":" + sec);
    }
}
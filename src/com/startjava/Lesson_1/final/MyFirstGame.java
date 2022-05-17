package Lesson1;

public class MyFirstGame {
    public static void main(String[] args) {
        int number = 35;
        int randomNum = (int) (Math.random() * 100 + 1);
        while (number != randomNum) {
            if (randomNum > number) {
                System.out.println("Число " + number + " меньше того, что загадал компьютер");
                number++;
            } else {
                System.out.println("Число " + number + " больше того, что загадал компьютер");
                number--;
            }
        }
        System.out.println("Вы победили число = " + randomNum);
    }
}

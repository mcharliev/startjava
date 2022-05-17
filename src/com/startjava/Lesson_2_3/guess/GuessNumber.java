package Lesson2;

import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int randomNum;
    private Player pl1;
    private Player pl2;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }
    public void launch() {
        randomNum = (int) (Math.random() * 100 + 1);
        System.out.println(randomNum);
        while (true) {
            System.out.print("Игрок " + pl1.getName() + " вводит число: ");
            int player1Number = scanner.nextInt();
            if (player1Number == randomNum) {
                System.out.println("Игрок " + pl1.getName() + " победил, число было - " + randomNum);
                break;
            } else if (player1Number < randomNum) {
                System.out.println("Число игрока " + pl1.getName() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число игрока " + pl1.getName() + " больше того, что загадал компьютер");
            }
            System.out.print("Игрок " + pl2.getName() + " вводит число: ");
            int player2Number = scanner.nextInt();
            if (player2Number == randomNum) {
                System.out.println("Игрок " + pl2.getName() + " победил, число было - " + randomNum);
                break;
            } else if (player2Number < randomNum) {
                System.out.println("Число игрока " + pl2.getName() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число игрока " + pl2.getName() + " больше того, что загадал компьютер");
            }
        }
    }
}







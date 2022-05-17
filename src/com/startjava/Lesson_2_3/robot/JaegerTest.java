package Lesson2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Romeo Blue");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("USA");
        jaeger1.setWeight(7.7);
        jaeger1.setHeight(77.7);
        jaeger1.setSpeed(2);
        jaeger1.setStrength(4);
        jaeger1.setArmor(6);
        jaeger1.setMainWeapon("Gatling Chest");
        System.out.print("Оружие " + jaeger1.getMainWeapon() + " позволяет " + jaeger1.getModelName() + " ");
        jaeger1.rangeFight();
        System.out.print("Фирминный прием " + jaeger1.getModelName());
        jaeger1.favoriteTrick(" разрыв трахеи");

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("HorizonBrave");
        jaeger2.setMark("Mark-1");
        jaeger2.setOrigin("China");
        jaeger2.setWeight(7.8);
        jaeger2.setHeight(72.5);
        jaeger2.setSpeed(8);
        jaeger2.setStrength(4);
        jaeger2.setArmor(6);
        jaeger2.setMainWeapon("Cryo-cannon");
        System.out.print("\nОружие " + jaeger2.getMainWeapon() + " позволяет " + jaeger2.getModelName() + " ");
        jaeger2.rangeFight();
        System.out.print("Фирминный прием " + jaeger2.getModelName());
        jaeger2.favoriteTrick(" заморозка врагов");
    }
}

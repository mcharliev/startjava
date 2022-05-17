package Lesson2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf greyWolf = new Wolf();
        greyWolf.setGender("Волк");
        greyWolf.setNickname("Амур");
        greyWolf.setWeight(45);
        greyWolf.setAge(4);
        greyWolf.setColor("серый");
        System.out.print(greyWolf.getGender() + " по кличке " + greyWolf.getNickname() + " весом ");
        System.out.print(greyWolf.getWeight() + " кг " + "окрас ");
        System.out.print(greyWolf.getColor() + " возраст " + greyWolf.getAge() + " года");
    }
}

package com.example.pack;

abstract class Animals {

    public abstract void sayHello();

}

abstract class HomeAnimals extends Animals {

    private String home_animal;

    public String getHome_animal() {
        return this.home_animal;
    }

}

abstract class WildAnimals extends Animals {

    private String wild_animal;

    public String getWild_animal() {
        return this.wild_animal;
    }

}

class UrsusArctos extends WildAnimals {

    private String name;
    private String color;
    private byte number_of_legs = 4;


    public UrsusArctos(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void sayHello() {
        System.out.println("Привіт! Мене звати " + name);
        System.out.println("Мій колір - " + color);
        System.out.println();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String new_color) {
        color = new_color;
    }

    final public byte getNumberOfLegs() {
        return this.number_of_legs;
    }
}

class UrsusArctosGobiensis extends UrsusArctos {

    private String location;

    public UrsusArctosGobiensis(String name, String color, String location) {
        super(name, color);
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

}

class UrsusArctosIsabellinus extends UrsusArctos {

    private String food;

    public UrsusArctosIsabellinus(String name, String color, String food) {
        super(name, color);
        this.food = food;
    }

    public String getFood() {
        return this.food;
    }

}

public class Main {
    public static void main(String[] args) {

        UrsusArctos animal_1 = new UrsusArctos("Сніжок", "білий");
        UrsusArctos animal_2 = new UrsusArctos("Барсик", "рудий");

        System.out.println("Animals 1, 2");
        System.out.println();

        animal_1.sayHello();
        animal_2.sayHello();

        System.out.println(animal_1.getColor());
        System.out.println(animal_2.getColor());
        System.out.println();

        animal_1.setColor("сірий");
        animal_2.setColor("коричневий");

        animal_1.sayHello();
        animal_2.sayHello();

        System.out.println(animal_1.getColor());
        System.out.println(animal_2.getColor());

        System.out.println("_____________________________________________________________________");

        UrsusArctosGobiensis animal_3 = new UrsusArctosGobiensis("Gobiensis 3", "коричневий", "location 3");

        System.out.println("Animal 3");
        System.out.println();

        animal_3.sayHello();
        System.out.println("Колір: " + animal_3.getColor());
        System.out.println();
        System.out.println("Кількість лап: " + animal_3.getNumberOfLegs());
        System.out.println();
        System.out.println("Місце: " + animal_3.getLocation());

        System.out.println("_____________________________________________________________________");

        UrsusArctosIsabellinus animal_4 = new UrsusArctosIsabellinus("Isabellinus 4", "сірий", "food 4");

        System.out.println("Animal 4");
        System.out.println();

        animal_4.sayHello();
        System.out.println("Колір: " + animal_4.getColor());
        System.out.println();
        System.out.println("Кількість лап: " + animal_4.getNumberOfLegs());
        System.out.println();
        System.out.println("Їжа: " + animal_4.getFood());

        System.out.println("_____________________________________________________________________");

        UrsusArctosGobiensis animal_5 = new UrsusArctosGobiensis("Gobiensis 5", "білий", "location 5");

        System.out.println("Animal 5");
        System.out.println();

        animal_5.sayHello();
        System.out.println("Колір: " + animal_5.getColor());
        System.out.println();
        System.out.println("Кількість лап: " + animal_5.getNumberOfLegs());
        System.out.println();
        System.out.println("Місце: " + animal_5.getLocation());

        System.out.println("_____________________________________________________________________");

        UrsusArctosGobiensis animal_6 = new UrsusArctosGobiensis("Gobiensis 6", "білий", "location 6");
        UrsusArctosGobiensis animal_6_another_reference = animal_6;

        System.out.println("Animal 6");
        System.out.println();

        animal_6_another_reference.sayHello();
        System.out.println(animal_6_another_reference.getLocation());

    }
}

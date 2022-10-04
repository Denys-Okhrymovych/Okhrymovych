# Okhrymovych

package com.example.pack;

public class UrsusArctos {


    private String name;
    private String color;


    public UrsusArctos(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public void sayHello() {
        System.out.println("Привіт! Мене звати " + name + ".");
        System.out.println("Мій колір - " + color + ".");
        System.out.println();
    }


    public String getColor() {
        return color;
    }

    public void setColor(String new_color) {
        color = new_color;
    }


    public static void main(String[] args) {

        UrsusArctos animal_1 = new UrsusArctos("Сніжок", "білий");

        UrsusArctos animal_2 = new UrsusArctos("Барсик", "рудий");

        animal_1.sayHello();

        animal_2.sayHello();

    }

}


import java.util.Random;

class Dog {
    private String name;
    private int number;
    private Habitat habitat = new Habitat();
    private Owner owner = new Owner();
    private static int count = 0;

    public Dog(String name, int number, String habitat, String owner) {
        this.name = name;
        this.number = number;
        this.habitat.habitat = habitat;
        this.owner.owner = owner;
        new Counter().setCount();
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public String getHabitat() {
        return this.habitat.habitat;
    }

    public String getOwner() {
        return this.owner.owner;
    }

    public static int getCount() {
        return count;
    }

    public static NameOfDog randomName() {
        int random = new Random().nextInt(NameOfDog.values().length);
        return NameOfDog.values()[random];

    }


    private class Habitat {
        private String habitat;
    }

    private class Owner {
        private String owner;
    }

    private static class Counter {
        private void setCount() {
            count = count + 1;
        }
    }
}

enum NameOfDog {
    ARCHIE, LUCKY, OSCAR, TEDDY
}


public class Main {
    public static void main(String[] args) {

        Dog dog_1 = new Dog("Dog A", 1, "Habitat 1", "Owner 1");
        Dog dog_2 = new Dog("Dog B", 2, "Habitat 2", "Owner 2");
        Dog dog_3 = new Dog("Dog C", 3, "Habitat 3", "Owner 3");
        Dog dog_4 = new Dog("Dog D", 4, "Habitat 4", "Owner 4");

        System.out.println("Number of dogs: " + Dog.getCount());
        System.out.println();
        System.out.println("Random name: " + Dog.randomName());
        System.out.println("_____________________________________________________________________");

        System.out.println("1.");
        System.out.println();

        System.out.println("Name: " + dog_1.getName());
        System.out.println("Number: " + dog_1.getNumber());
        System.out.println("Habitat: " + dog_1.getHabitat());
        System.out.println("Owner: " + dog_1.getOwner());
        System.out.println("_____________________________________________________________________");

        System.out.println("2.");
        System.out.println();

        System.out.println("Name: " + dog_2.getName());
        System.out.println("Number: " + dog_2.getNumber());
        System.out.println("Habitat: " + dog_2.getHabitat());
        System.out.println("Owner: " + dog_2.getOwner());
        System.out.println("_____________________________________________________________________");

        System.out.println("3.");
        System.out.println();

        System.out.println("Name: " + dog_3.getName());
        System.out.println("Number: " + dog_3.getNumber());
        System.out.println("Habitat: " + dog_3.getHabitat());
        System.out.println("Owner: " + dog_3.getOwner());
        System.out.println("_____________________________________________________________________");

        System.out.println("4.");
        System.out.println();

        System.out.println("Name: " + dog_4.getName());
        System.out.println("Number: " + dog_4.getNumber());
        System.out.println("Habitat: " + dog_4.getHabitat());
        System.out.println("Owner: " + dog_4.getOwner());
    }
}
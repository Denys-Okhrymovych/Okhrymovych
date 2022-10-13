import java.util.Arrays;
import java.util.Comparator;

interface Say {
    String say_1();
    String say_2();
}

interface Move {
    String walk();
    String run();
}

class Dog implements Say, Move, Comparable<Dog> {
    private String name;
    private int number;

    public Dog(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String say_1() {
        return "Hello!";
    }
    @Override
    public String say_2() {
        return "I'm Dog.";
    }
    @Override
    public String walk() {
        return "Dog can walk.";
    }
    @Override
    public String run() {
        return "Dog can run.";
    }
    @Override
    public String toString() {
        return name + ", " + number;
    }
    @Override
    public int compareTo(Dog d) {
        if (this.name.compareTo(d.name) != 0) {
            return this.name.compareTo(d.name);
        } else {
            return Integer.compare(this.number, d.number);
        }
    }
}

class Cat implements Say, Move {
    private String name;
    private int number;

    public Cat(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String say_1() {
        return "Hello!";
    }
    @Override
    public String say_2() {
        return "I'm Cat.";
    }
    @Override
    public String walk() {
        return "Cat can walk.";
    }
    @Override
    public String run() {
        return "Cat can run.";
    }
    @Override
    public String toString() {
        return name + ", " + number;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }
}

class Fox implements Say, Move, Cloneable {
    private String name;
    private int number;

    public Fox(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String say_1() {
        return "Hello!";
    }
    @Override
    public String say_2() {
        return "I'm Fox.";
    }
    @Override
    public String walk() {
        return "Fox can walk.";
    }
    @Override
    public String run() {
        return "Fox can run.";
    }
    @Override
    public String toString() {
        return name + ", " + number;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class CatNameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.getName() != c2.getName()) {
            return c1.getName().compareTo(c2.getName());
        } else {
            return Integer.compare(c1.getNumber(), c2.getNumber());
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Dog dog[] = {
            new Dog("Dog B", 5),
            new Dog("Dog A", 2),
            new Dog("Dog C", 8),
            new Dog("Dog A", 4)
        };

        System.out.println("Unsorted");
        System.out.println();

        for (Dog d : dog) {
            System.out.println(d);
        }
        System.out.println("_____________________________________________________________");

        Arrays.sort(dog);

        System.out.println("Sorted");
        System.out.println();

        for (Dog d : dog) {
            System.out.println(d);
        }
        System.out.println("_____________________________________________________________");

        Cat cat[] = {
                new Cat("Cat H", 9),
                new Cat("Cat F", 7),
                new Cat("Cat H", 5),
                new Cat("Cat C", 2)
        };

        System.out.println("Unsorted");
        System.out.println();

        for (Cat c : cat) {
            System.out.println(c);
        }
        System.out.println("_____________________________________________________________");

        Arrays.sort(cat, new CatNameComparator());

        System.out.println("Sorted");
        System.out.println();

        for (Cat c : cat) {
            System.out.println(c);
        }
        System.out.println("_____________________________________________________________");

        try {
            Fox fox = new Fox("Fox A", 1);

            Fox copyOfFox = (Fox) fox.clone();

            System.out.println(fox);
            System.out.println(copyOfFox);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
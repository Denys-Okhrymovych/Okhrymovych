import java.util.ArrayList;
import java.util.Scanner;

class InvalidOffspringNumberException extends Exception {
    public InvalidOffspringNumberException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scannerInteger = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        ArrayList<String> animalNames = new ArrayList<>();
        ArrayList<Integer> offspringNumbers = new ArrayList<>();

        boolean quit = true;

        int item, animalNumber, offspringNumber;
        String animalName;

        do {
            System.out.println("1. Додати тварину в список.");
            System.out.println("2. Додати нащадків тварини.");
            System.out.println("3. Переглянути список тварин.");
            System.out.println("4. Переглянути список тварин і їхніх нащадків.");
            System.out.println("5. Переглянути введену кількість нащадків окремої тварини.");
            System.out.println("6. Вихід.");
            System.out.println();
            System.out.print("Виберіть номер пункту: ");
            item = scannerInteger.nextInt();
            System.out.println();
            System.out.println();

            switch (item) {
                case 1:
                    System.out.println("1. Додати тварину в список.");
                    System.out.println();
                    System.out.println();
                    System.out.print("Введіть назву тварини: ");
                    animalName = scannerString.nextLine();
                    System.out.println();
                    animalNames.add(animalName);
                    System.out.println("Тварину додано в список.");
                    break;

                case 2:
                    System.out.println("2. Додати нащадків тварини.");
                    System.out.println();
                    System.out.println();

                    if (animalNames.size() != 0) {

                        System.out.print("Список тварин.");
                        System.out.println();

                        for (int i = 0; i < animalNames.size(); i++) {
                            System.out.println((i+1) + ". " + animalNames.get(i));
                        }
                        System.out.println();
                        System.out.println();
                        System.out.print("Виберіть номер тварини зі списку: ");

                        animalNumber = scannerInteger.nextInt();

                        if (animalNumber < 1 || animalNumber > animalNames.size() || animalNames.size() == 0) {

                            System.out.println("Цей номер відсутній.");

                        } else {

                            System.out.println();
                            System.out.print("Введіть кількість нащадків: ");

                            try {
                                offspringNumber = scannerInteger.nextInt();
                                System.out.println();

                                validate(offspringNumber);

                                offspringNumbers.add(animalNumber - 1, offspring(offspringNumber));

                                System.out.println("Кількість нащадків: " + offspringNumbers.get(animalNumber - 1));

                            } catch (InvalidOffspringNumberException e) {
                                System.out.println("\n" + e);
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("У програмі діє послідовне введення кількості нащадків");
                                System.out.println("(не для всіх попередніх тварин вказано кількість нащадків)\n"
                                + e);
                            } finally {
                                System.out.println("Можна вибрати наступний пункт.");
                            }

                        }

                    } else {
                        System.out.println("Неможливо додати нащадків, тому що список тварин порожній.");
                    }
                    break;

                case 3:
                    System.out.println("3. Переглянути список тварин.");
                    System.out.println();
                    System.out.println();

                    if (animalNames.size() != 0) {
                        for (int i = 0; i < animalNames.size(); i++) {
                            System.out.println((i+1) + ". " + animalNames.get(i));
                        }
                    } else {
                        System.out.println("Список тварин порожній.");
                    }
                    break;

                case 4:
                    System.out.println("4. Переглянути список тварин і їхніх нащадків.");
                    System.out.println();
                    System.out.println();

                    if (animalNames.size() != 0) {
                        for (int i = 0; i < offspringNumbers.size(); i++) {
                            System.out.println((i+1) + ". " + animalNames.get(i) + ", кількість нащадків: " +
                                    offspringNumbers.get(i));
                        }

                        if (animalNames.size() > offspringNumbers.size()) {
                            for (int i = offspringNumbers.size(); i < animalNames.size(); i++) {
                                System.out.println((i+1) + ". " + animalNames.get(i) + ", інформацію про нащадків не введено");
                            }
                        }

                    } else {
                        System.out.println("Список тварин порожній.");
                    }
                    break;

                case 5:
                    System.out.println("5. Переглянути введену кількість нащадків окремої тварини.");
                    System.out.println();
                    System.out.println();

                    if (animalNames.size() != 0) {

                        System.out.print("Список тварин.");
                        System.out.println();

                        for (int i = 0; i < animalNames.size(); i++) {
                            System.out.println((i+1) + ". " + animalNames.get(i));
                        }
                        System.out.println();
                        System.out.println();
                        System.out.print("Виберіть номер тварини зі списку: ");

                        try {
                            animalNumber = scannerInteger.nextInt();

                            System.out.println(animalNames.get(animalNumber - 1) + ":");

                            System.out.println(offspringNumbers.get(animalNumber - 1));

                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Тварину з таким індексом ще не додано або не введено кількість її нащадків\n"
                                    + e);
                        }

                    } else {
                        System.out.println("Неможливо переглянути, тому що список тварин порожній.");
                    }
                    break;

                case 6:
                    System.out.println("6. Вихід.");
                    System.out.println();
                    System.out.println();

                    quit = false;
                    break;

                default:
                    System.out.println("Цей пункт відсутній.");
            }
            System.out.println("____________________________________________________________________________");
            System.out.println();
        }
        while (quit);

    }

    public static <T extends Integer> T offspring(T number) {
        return number;
    }

    static void validate(int offspringNumber) throws InvalidOffspringNumberException {
        if (offspringNumber < 0) {
            throw new InvalidOffspringNumberException("Допустима кількість нащадків не менша за нуль.");
        }
    }


}
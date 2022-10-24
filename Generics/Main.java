import java.util.ArrayList;
import java.util.Scanner;


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
            System.out.println("5. Вихід.");
            System.out.println();
            System.out.print("Виберіть номер пункту: ");
            item = scannerInteger.nextInt();
            System.out.println();
            System.out.println();

            switch (item) {
                case 1:
                    System.out.print("Введіть назву тварини: ");
                    animalName = scannerString.nextLine();
                    System.out.println();
                    animalNames.add(animalName);
                    System.out.println("Тварину додано в список.");
                    break;

                case 2:
                    System.out.print("Список тварин.");
                    System.out.println();

                    for (int i = 0; i < animalNames.size(); i++) {
                        System.out.println((i+1) + ". " + animalNames.get(i));
                    }

                    System.out.println();
                    System.out.println();
                    System.out.print("Виберіть номер тварини зі списку: ");

                    animalNumber = scannerInteger.nextInt();

                    System.out.println();
                    System.out.print("Введіть кількість нащадків: ");
                    offspringNumber = scannerInteger.nextInt();

                    System.out.println();
                    offspringNumbers.add(animalNumber - 1, offspring(offspringNumber));

                    System.out.println("Кількість нащадків: " + offspringNumbers.get(animalNumber - 1));
                    break;

                case 3:
                    for (int i = 0; i < animalNames.size(); i++) {
                        System.out.println((i+1) + ". " + animalNames.get(i));
                    }
                    break;

                case 4:
                    for (int i = 0; i < animalNames.size(); i++) {
                        System.out.println((i+1) + ". " + animalNames.get(i) + ", кількість нащадків: " +
                    offspringNumbers.get(i));
                    }
                    break;

                case 5:
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


}
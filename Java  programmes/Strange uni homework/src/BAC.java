import java.util.Scanner;

public class BAC {
    static Scanner sc = new Scanner(System.in);

    static String[] bgText = {"Тегло: ", "Пол: ", "Брой консумирани напитки: ", "Количество алкохол в проценти за всяка напитка: ", "Време, изминало от последната напитка (в часове): "};
    static String[] enTExt = {"Weight: ", "Gender: ", "Number of drinks: ", "Alcohol Percentage of drink: ", "The time since the last drink (in hours) : "};

    static void print(String preferredLanguage) {
        double weight = 0.0;
        int numberOfDrinks = 0;
        double alcoholPerCent;
        double r = 0.0;
        double a = 0.0;
        int timeInHoursSinceTheLastDrink = 0;
        int j = 0;

        while (j < 5) {
            if (preferredLanguage.equalsIgnoreCase("БГ")) {
                System.out.println(bgText[j]);
            } else {
                System.out.println(enTExt[j]);
            }

            switch (j) {
                case 0:
                    weight = sc.nextDouble();
                    break;

                case 1:
                    sc.nextLine();
                    String gender = sc.nextLine();

                    if (gender.equals("мъж") || gender.equals("man")) {
                        r = 0.73;
                    } else if (gender.equals("жена") || gender.equals("woman")) {
                        r = 0.66;
                    }
                    break;

                case 2:
                    numberOfDrinks = sc.nextInt();
                    break;

                case 3:
                    System.out.print("percentage= ");
                    alcoholPerCent = sc.nextDouble();

                    a = numberOfDrinks * (alcoholPerCent / 100d);
                    break;

                case 4:
                    timeInHoursSinceTheLastDrink = sc.nextInt();
                    break;
            }
            j++;
        }
        double bac = ((a * 5.14) / (weight * r)) - (0.015 * timeInHoursSinceTheLastDrink);

        if (preferredLanguage.equalsIgnoreCase("БГ")) {

            if (bac > 0) {
                System.out.printf("Вашето количество алкохол в кръвта е %.2f\n", bac);
            } else {
                System.out.println("Вашето количество алкохол в кръвта е 0.00");
            }
        } else {
            if (bac > 0) {
                System.out.printf("Your BAC is %.2f\n", bac);
            } else {
                System.out.println("Your BAC is 0");
            }
        }

        if (bac < 0.09) {

            if (preferredLanguage.equalsIgnoreCase("БГ")) {
                System.out.println("Можете да карате.");
            } else {
                System.out.println("It is legal for you to drive.");
            }
        } else {
            if (preferredLanguage.equalsIgnoreCase("БГ")) {
                System.out.println("Не можете да карате.");
            } else {
                System.out.println("It is NOT legal for you to drive.");
            }
        }
    }

    public static void main(String[] args) {
        String preferredLanguage = Taxes.language();
        print(preferredLanguage);
    }
}
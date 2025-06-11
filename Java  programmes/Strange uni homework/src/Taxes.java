import java.util.Scanner;

public class Taxes {

    static Scanner sc = new Scanner(System.in);
    static String preferredLanguage = " ";
    static String state = " ";
    static double purchase = 0.00;
    static double tax = 0.00;
    static double totally = 0.0;

    public static String language() {

        String questionForLanguagePreference = """
                Изберете език (Choose a language):
                БГ/EN
                """;
        System.out.print(questionForLanguagePreference);
        String preferredLanguage = sc.nextLine();

        while (!(preferredLanguage.equalsIgnoreCase("БГ") || preferredLanguage.equalsIgnoreCase("EN"))) {
            System.out.println("Грешка! Въведете БГ за български или EN за английски!\n(Error! Choose БГ for Bulgarian or EN for English!)");
            preferredLanguage = sc.nextLine();
        }

        return preferredLanguage;
    }

    static void stateName(String preferredLanguage) {

        if (preferredLanguage.equalsIgnoreCase("БГ")) {

            System.out.println("Кой е щатът?");
            sc.nextLine();
            state = sc.nextLine();
        } else if (preferredLanguage.equalsIgnoreCase("EN")) {

            System.out.println("What is the state?");
            state = sc.nextLine();
        }
    }

    static double total(String state, double purchase) {

        if (state.equalsIgnoreCase("Wisconsin") || state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Уисконсин") || state.equalsIgnoreCase("УИ")) {
            tax = 0.055;
        }
        purchase = purchase + purchase * tax;

        return purchase;
    }

    static void print(String preferredLanguage, String state, double purchase, double totally) {
        String[] enText = {"What is the order amount?\n", "\nThe subtotal is $ ", "\nThe tax is $ ", "\nThe total is $ "};
        String[] bgText = {"Колко струва покупката?\n", "\nМеждинната сума е $ ", "\nДанъкът е $ ", "\nОбщо $ "};

        int i = 0;
        while (i < 4) {

            if (preferredLanguage.equalsIgnoreCase("БГ")) {
                System.out.print(bgText[i]);

            } else if (preferredLanguage.equalsIgnoreCase("EN")) {
                System.out.print(enText[i]);
            }

            switch (i) {
                case 0:
                    purchase = sc.nextDouble();

                    stateName(preferredLanguage);
                    totally = total(state, purchase);
                    break;
                case 1:
                    System.out.printf("%.2f ", purchase);
                    break;
                case 2:
                    System.out.printf("%.2f ", tax);
                    break;
                case 3:
                    System.out.printf("%.2f ", totally);
                    break;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        preferredLanguage = language();
        print(preferredLanguage, state, purchase, totally);
    }
}
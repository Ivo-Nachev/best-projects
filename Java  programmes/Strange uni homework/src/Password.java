import java.util.Scanner;

public class Password {

    static Scanner sc = new Scanner(System.in);

    static void check(String preferredLanguage) {

        boolean isBg = false;

        if (preferredLanguage.equalsIgnoreCase("БГ")) {
            System.out.println("Каква е паролата?");
            isBg = true;

        } else if (preferredLanguage.equalsIgnoreCase("EN")) {
            System.out.println("What is the password?");
        }

        String writeThePassword = sc.nextLine();

        boolean correctPassword = writeThePassword.equals("abc$123");

        if (correctPassword) {
            if (isBg) {
                System.out.println("Добре дошли!");
            } else {
                System.out.println("Welcome!");
            }
        } else {
            if (isBg) {
                System.out.println("Не Ви познавам!");
            } else {
                System.out.println("I do not know you!");
            }
        }
    }

    public static void main(String[] args) {
        String preferredLanguage = Taxes.language();
        check(preferredLanguage);
    }
}
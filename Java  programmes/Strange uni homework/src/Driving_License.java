import java.util.Scanner;

public class Driving_License {

    static Scanner sc = new Scanner(System.in);
    static String nationality = " ";
    static int age = 0;

    static boolean checkUSA_Nationality = false;
    static boolean checkBG_Nationality = false;

    static boolean checkBG_Language = false;

    static String[] bgText = {"Какъв сте по народност?", "Каква е вашата възраст?", "Невалидна стойност! Въведете число, по- голямо от нула!", "Вие сте достатъчно възрастен, за да шофирате законно.", "Вие не сте достатъчно възрастен, за да шофирате законно."};
    static String[] enText = {"What is your nationality?", "What is your age?", "Invalid value! Enter a number greater than 0!", "You are old enough to legally drive.", "You are not old enough to legally drive."};

    static void nationalityFunction(String preferredLanguage) {

        nationality = sc.nextLine();

        checkUSA_Nationality = nationality.equalsIgnoreCase("USA") || nationality.equalsIgnoreCase("United States of America") || nationality.equalsIgnoreCase("САЩ") || nationality.equalsIgnoreCase("Съединени Американски щати");
        checkBG_Nationality = nationality.equalsIgnoreCase("BG") || nationality.equalsIgnoreCase("Bulgaria") || nationality.equalsIgnoreCase("БГ") || nationality.equalsIgnoreCase("България");

        if (!(checkUSA_Nationality || checkBG_Nationality)) {
            if (checkBG_Language) {
                nationality = "друга държава";
            } else {
                nationality = "other country";
            }
        }
    }

    static void ageFunction() {
        age = sc.nextInt();

        while (age < 0) {
            if (checkBG_Language) {
                System.out.println(bgText[2]);
            } else {
                System.out.println(enText[2]);
            }

            age = sc.nextInt();
        }

        boolean canHaveALicense = false;

        if (checkUSA_Nationality && age >= 16) {
            canHaveALicense = true;
        } else if (checkBG_Nationality && age >= 18) {
            canHaveALicense = true;
        } else if ((nationality.equals("друга държава") || nationality.equals("other country")) && age >= 21) {
            canHaveALicense = true;
        }

        if (canHaveALicense) {
            if (checkBG_Language) {
                System.out.println(bgText[3]);
            } else {
                System.out.println(enText[3]);
            }
        } else {
            if (checkBG_Language) {
                System.out.println(bgText[4]);
            } else {
                System.out.println(enText[4]);
            }
        }
    }

    static void print(String preferredLanguage, String nationality) {
        int i = 0;

        while (i < 2) {

            if (checkBG_Language) {
                System.out.println(bgText[i]);
            } else {
                System.out.println(enText[i]);
            }

            switch (i) {
                case 0:
                    nationalityFunction(preferredLanguage);
                    break;
                case 1:
                    ageFunction();
                    break;
            }

            i++;
        }
    }

    public static void main(String[] args) {
        String preferredLanguage = Taxes.language();
        checkBG_Language = preferredLanguage.equalsIgnoreCase("БГ");

        print(preferredLanguage, nationality);
    }
}
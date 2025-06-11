import java.util.Scanner;

public class Credit {

    static Scanner sc = new Scanner(System.in);

    static String preferredLanguage = " ";
    static boolean check_BG_language = false;
    static String[] bgText = {"Какъв е балансът ви? ", "Какъв е вашият годишен лихвен процент? ", "Колко можете да плащате на месец? "};
    static String[] enTExt = {"What is your balance? ", "What is the APR on the card (as a percent)? ", "What is the monthly payment you can make? "};

    public static void inputAndCalculations() {
        double b = 0.0;
        double apr = 0.0;
        double p = 0.0;
        if (preferredLanguage.equalsIgnoreCase("БГ")) {
            check_BG_language = true;
        }

        int j = 0;
        while (j < 3) {
            if (check_BG_language) {
                System.out.print(bgText[j]);
            } else {
                System.out.print(enTExt[j]);
            }

            switch (j) {
                case 0:
                    b = sc.nextDouble();
                    break;
                case 1:
                    apr = sc.nextDouble();
                    break;
                case 2:
                    p = sc.nextDouble();
                    p = Math.ceil(p);
                    break;
            }
            j++;
        }

        double i = (apr / 100) / 365;
        int n = (int) (((double) -1 / 30) * (Math.log(1 + (b / Math.ceil(p)) * (1 - Math.pow(1 + i, 30))) / (Math.log(1 + i))));

        if (check_BG_language) {
            System.out.println("Ще ви отнеме " + n + " месеца, за да изплатите дълга си!");
        } else {
            System.out.println("It will take you " + n + " months to pay off this card!");
        }
    }

    public static void main(String[] args) {
        preferredLanguage = Taxes.language();
        inputAndCalculations();
    }
}
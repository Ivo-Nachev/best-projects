public class Option {

    public static int choice() {

        int choice;

        System.out.println("\n"+ Main.menuOptions);
        do {
            System.out.println("Choose one of the options between 1 to 10.");
            choice= Main.sc.nextInt();

        }while (choice<1 || choice>10);

        return choice;
    }
}

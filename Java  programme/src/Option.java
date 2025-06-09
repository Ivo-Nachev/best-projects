public class Option {

    public static int choice() {

        int choice;

        System.out.println("\n"+ Main.menuOptions);
        do {
            System.out.println("Изберете една от опциите между 1 и 10, като въведете число.");
            choice= Main.sc.nextInt();

        }while (choice<1 || choice>10);

        return choice;
    }
}
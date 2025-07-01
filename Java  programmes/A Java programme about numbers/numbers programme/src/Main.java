import java.util.Scanner;
import static java.lang.System.exit;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static String menuOptions =
            """
                            1. Looking for a number's position
                            2. Shuffle the numbers
                            3. Find the numbers' sum
                            4. Find the biggest number
                            5. Find the smallest number
                            6. Find the numbers' average
                            7. Check if the array is symmetrical
                            8. Print the numbers' array in reverse
                            9. Print the input
                            10.Exit
                    """;


    public static void menu(int []arr) {

        int choice = Option.choice();
        if (choice == 10) {
            exit(0);
            System.out.println("Bye");
        } else {
            ArrayOperations.functionalities(arr,choice);
        }
    }

    public static void main(String[] args) {
        int[] arr;
        System.out.println("Enter array's length: ");
        arr = ArrayInput.inputArray();
        menu(arr);
    }
}
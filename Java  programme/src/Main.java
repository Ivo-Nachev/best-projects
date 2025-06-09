import java.util.Scanner;
import static java.lang.System.exit;

public class Main {

    public static Scanner sc = new Scanner(System.in);


    public static String menuOptions =
            """
                            1. Търсене на позиция на конкретно число
                            2. Разбъркване на числата
                            3. Изчисляване на сбора на всички числа
                            4. Намиране на най-голямото число
                            5. Намиране на най-малкото число
                            6. Намиране средно-аритметично на числата
                            7. Проверка за симетричност на масива от числа
                            8. Обръщане на масива от числа
                            9 .Визуализирай въведените числа
                            10. Изход
                    """;


    public static void menu(int []arr) {

        int choice = Option.choice();
        if (choice == 10) {
            exit(0);
        } else {
            ArrayOperations.functionalities(arr,choice);
        }
    }

    public static void main(String[] args) {
        int[] arr;
        System.out.println("Въведете дължината на масива: ");
        arr = ArrayInput.inputArray();
        menu(arr);
    }
}
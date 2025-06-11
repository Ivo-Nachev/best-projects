public class FunctionalityThreeAndSix {
    public static void thirdAndSixthFunctionality(int[] arr, int choice) {
        double sum = 0;
        for (int j : arr) {

            sum += j;
        }

        if (choice == 3) {
            System.out.println("Сумата от елементите на масива е " + (int)sum+".");
        } else  {
            sum /= arr.length;
            System.out.printf("Средното аритметично на елементите от масива е %.2f.",sum);
        }
    }
}
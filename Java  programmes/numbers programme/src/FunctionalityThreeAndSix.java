public class FunctionalityThreeAndSix {
    public static void thirdAndSixthFunctionality(int[] arr, int choice) {
        double sum = 0;
        for (int j : arr) {

            sum += j;
        }

        if (choice == 3) {
            System.out.println("Numbers' sum is " + (int)sum+".");
        } else  {
            sum /= arr.length;
            System.out.printf("Numbers' average is %.2f.",sum);
        }
    }
}

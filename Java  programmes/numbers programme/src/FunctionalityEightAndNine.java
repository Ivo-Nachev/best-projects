public class FunctionalityEightAndNine {

    public static void ninthAndEightFunctionality(int[] arr, int choice) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (choice == 8) {
                System.out.println("arr[" + (i + 1) + "]= " + arr[i]);

            } else {
                System.out.println("arr[" + (arr.length - 1 - i) + "]= " + arr[arr.length - 1 - i]);
            }
        }

    }
}

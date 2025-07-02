public class FunctionalityFourAndFive {
    public static void fourthAndFifthFunctionality(int[] arr, int choice) {
        int num = arr[0];
        boolean isBigger = false;

        for (int j : arr) {
            if (choice == 4) {
                if (num < j) {
                    num = j;
                    isBigger = true;

                }
            } else {
                if (num > j) {
                    num = j;
                }
            }
        }


        if (isBigger) {
            System.out.println("The biggest number is " + num);
        } else {
            System.out.println("The smallest number is " + num);
        }
    }
}

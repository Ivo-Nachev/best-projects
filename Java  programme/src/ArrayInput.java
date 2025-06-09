public class ArrayInput {

    public static int[] inputArray() {

        final int ARRAY_LENGTH = Main.sc.nextInt();
        int[] arr = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.print(i + 1 + ". number: ");
            arr[i] = Main.sc.nextInt();
        }

        return arr;
    }
}
import java.util.Random;

public class FunctionalityTwo {
    public static void secondFunction(int[] arr) {
        Random rand = new Random();
        System.out.println("Shuffled array: ");
        int[] randPositions = new int[arr.length];

        int[] randIndex = new int[randPositions.length];

        int i=0;

        while ( i<randPositions.length) {

            randIndex[i] = rand.nextInt(arr.length);

            if (randPositions[randIndex[i]] == 0) {
                System.out.println("arr["+randIndex[i]+"]= "+arr[randIndex[i]]);
                randPositions[randIndex[i]] = 1;

                i++;
            }
        }
    }
}
import java.util.Random;

public class FunctionalityTwo {
    public static void secondFunction(int[] arr) {
        Random rand = new Random();
        System.out.println("Масивът с разбъркани елементи:");
        int[] randPositions = new int[arr.length];

        int[] randNum = new int[randPositions.length];

        int counter = 0;

        int i=0;

        while (counter != randPositions.length || i<randPositions.length) {

            randNum[i] = rand.nextInt(arr.length-1+1);

            if (randPositions[randNum[i]] == 0) {
                System.out.println("arr["+randNum[i]+"]= "+arr[randNum[i]]);
                randPositions[randNum[i]] = 1;
                counter++;
                i++;
            }
        }
    }
}
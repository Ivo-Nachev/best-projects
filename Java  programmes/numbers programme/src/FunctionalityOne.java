public class FunctionalityOne {
    public static void firstFunctionality(int []arr) {

        System.out.println("Enter the number you are looking for: ");
        int value = Main.sc.nextInt();

        int[] bubbleArray = new int[arr.length];

        System.arraycopy(arr,0,bubbleArray,0,arr.length);

        int bubble;


        for (int i = 1; i < bubbleArray.length; i++) {

            for (int j = 1; j < bubbleArray.length; j++) {

                if (bubbleArray[j - 1] > bubbleArray[j]) {
                    bubble = bubbleArray[j - 1];
                    bubbleArray[j - 1] = bubbleArray[j];
                    bubbleArray[j] = bubble;
                }
            }
        }

        int down = 0;
        int up = bubbleArray.length - 1;
        int middle;

        int i=0;

        while (down <= up) {


            middle = (down + up) / 2;



            if (bubbleArray[middle] == value) {

                while (true){
                    if(arr[i] == bubbleArray[middle]){
                        System.out.println("The number is found on " + (i+1) + ". position.");
                        break;
                    }
                    i++;
                }
                break;
            } else if (bubbleArray[middle] < value) {

                down = middle + 1;

            } else if (bubbleArray[middle] > value) {
                up = middle - 1;

            }

            if (down > up) {

                System.out.println("There is not such a value!");
                break;
            }
        }
    }
}

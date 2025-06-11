public class FunctionalitySeven {
    public static void seventhFunction(int[] arr) {
        boolean sym=true;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                sym = false;
                break;
            }
        }

        if(sym){
            System.out.println("Масивът е симетричен.");
        }else {
            System.out.println("Масивът не е симетричен.");
        }
    }
}

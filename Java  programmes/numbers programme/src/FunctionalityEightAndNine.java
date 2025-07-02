public class FunctionalityEightAndNine {

    public static void ninthFunctionality(int[]arr, int choice) {

        if(choice==8){
            for (int i = arr.length-1; i>=0; i--) {

                System.out.println("arr["+(i+1)+"]= "+arr[i]);
            }
        }else{
            for (int i = 0; i < arr.length ; i++) {
                System.out.println("arr["+(i+1)+"]= "+arr[i]);
            }
        }

    }
}

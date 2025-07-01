public class ArrayOperations {
    public static void functionalities(int[] arr, int choice) {

        switch (choice) {
            case 1 -> FunctionalityOne.firstFunctionality(arr);

            case 2 -> FunctionalityTwo.secondFunction(arr);

            case 3,6 ->FunctionalityThreeAndSix.thirdAndSixthFunctionality(arr,choice) ;

            case 4,5 -> FunctionalityFourAndFive.fourthAndFifthFunctionality(arr,choice);

            case 7 ->FunctionalitySeven.seventhFunction(arr);

            case 8,9 -> FunctionalityEightAndNine.ninthFunctionality(arr, choice);
        }
        Main.menu(arr);
    }
}
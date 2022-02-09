import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] userArray = getIntegers(5);
        int[] sortedArray = sortIntegers(userArray);
        printArray(sortedArray);
    }

    // methods
    public static int [] sortIntegers (int[] array) {
        // make copy of array
        int[] sortedArray = Arrays.copyOf(array, array.length);

//        boolean flag = true;
//        int temp;
//        while (flag) {
//            flag = false;
//            for (int i=0; i<sortedArray.length - 1; i++) {
//                if (sortedArray[i] < sortedArray[i+1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }

        // another way to solve
        for (int i=0; i<array.length; i++) {
            int highest = sortedArray[i];
            for (int j=i+1; j<array.length; j++) {
                if (array[j] > highest) {
                    highest = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = highest;
                }
            }
        }
        return sortedArray;
    }

    public static int[] getIntegers(int arraySize) {
        // get user input
        Scanner scanner = new Scanner(System.in);

        int[] userArray = new int[arraySize];

        System.out.println("Please enter " + arraySize + " integers below:");
        for (int i=0; i<arraySize; i++) {
            userArray[i] = scanner.nextInt();
        }
        scanner.close();
        return userArray;
    }

    public static void printArray (int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}

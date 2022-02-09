import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

//    public static void main(String[] args) {
//        int num = readInteger();
//        int[] arr = readElements(num);
//        findMin(arr);
//    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many numbers");
        int howManyNumbers = scanner.nextInt();
        return howManyNumbers;
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for(int i=0; i<number; i++) {
            System.out.println("Please enter a number");
            int enteredNumber = scanner.nextInt();
            array[i] = enteredNumber;
        }
        scanner.close();
        System.out.println("Array: " + Arrays.toString(array));
        return array;
    }

    private static int findMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("-> minNumber: " + minNumber);
        return minNumber;
    }
}

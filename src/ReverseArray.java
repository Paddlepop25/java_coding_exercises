import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 28, 7, -6, 81};
        reverse(arr);
    }

    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));

        int[] reversedArray = Arrays.copyOf(array, array.length);
        for (int i=0; i<array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
     }
}

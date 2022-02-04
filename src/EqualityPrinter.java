public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    private static final String INVALID_VALUE = "Invalid Value";
    private static final String EQUAL_NUMBERS = "All numbers are equal";
    private static final String DIFFERENT_NUMBERS = "All numbers are different";
    private static final String NEITHER_OR = "Neither all are equal or different";

    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println(INVALID_VALUE);
        } else if (num1 == num2 && num1== num3 && num2 == num3) {
            System.out.println(EQUAL_NUMBERS);
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println(DIFFERENT_NUMBERS);
        } else {
            System.out.println(NEITHER_OR);
        }
    }
}

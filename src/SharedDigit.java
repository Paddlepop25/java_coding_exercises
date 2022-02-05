public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(10, 100));
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        int firstDigitNum1 = num1 / 10;
        int firstDigitNum2 = num2 / 10;
        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;
        boolean compare1 = firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == lastDigitNum2;
        boolean compare2 = lastDigitNum1 == firstDigitNum2 || lastDigitNum1 == lastDigitNum2;
        return compare1 || compare2;
    }
}

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
//    public static int sumFirstAndLastDigit(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        String numberToString = Integer.toString(number);
//        char firstNumber = numberToString.charAt(0);
//        char lastNumber = numberToString.charAt((numberToString.length() - 1));
//        int changeToIntegerFirstNum = Character.getNumericValue(firstNumber);
//        int changeToIntegerSecondNum = Character.getNumericValue(lastNumber);
//        return changeToIntegerFirstNum + changeToIntegerSecondNum;
//    }

    // 2nd way to solve
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = number; // make a copy of number
        while (firstDigit > 9) {
            firstDigit /= 10; // see below to get 1st digit
        }
        int lastDigit = number % 10;
        return firstDigit + lastDigit;
    }

    // how to get 1st digit
//    example number is 2465
//    2465 / 10 = 246.5 <= int will take 246
//    246 / 10 = 24.6 <= int will take 24
//    24 / 10 = 2.4 <= int will take 2
}

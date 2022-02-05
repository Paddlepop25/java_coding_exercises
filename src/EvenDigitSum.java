public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-252));
    }
//    public static int getEvenDigitSum(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int sum = 0;
//        String numberToString = Integer.toString(number);
//        for (int i=0; i<numberToString.length(); i++) {
//            if(numberToString.charAt(i) % 2 == 0) {
//                sum += Character.getNumericValue(numberToString.charAt(i));
//            }
//        }
//        return sum;
//    }

    // another way to solve
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 1) {
            int lastDigit = number % 10; // get last digit
            if (lastDigit % 2 == 0) { // check if that digit is even
                sum += lastDigit;
            }
            number /= 10; // remove last digit, run loop to test new last digit
        }
        return sum;
    }
}

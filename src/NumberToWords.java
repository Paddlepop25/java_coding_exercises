public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1010);
        numberToWords(123);
        numberToWords(100);
        numberToWords(-26);

//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        for (int i=0; i<getDigitCount(number); i++) {
            int lastDigit = reversedNumber % 10;
            switch(lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            reversedNumber /= 10;
        }
    }
    public static int reverse(int number) {
        boolean isNegative = number < 0;
        int reversedNumber = 0;
        if (number < 0) {
            number *= -1;
        }
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return isNegative ? reversedNumber * -1 : reversedNumber;
    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int length = String.valueOf(number).length();
        return length;
    }
}

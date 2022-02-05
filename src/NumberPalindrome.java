public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(1234));
    }
    // method
    public static boolean isPalindrome(int number) {
        int convertedNumber = number < 0 ? number * -1 : number;
        String stringedNumber = Integer.toString(convertedNumber);
        String reversedString = new StringBuilder(stringedNumber).reverse().toString();
        int reversedStringInteger = number < 0 ? Integer.parseInt(reversedString) * -1 : Integer.parseInt(reversedString);
        return reversedStringInteger == number;
    }
}

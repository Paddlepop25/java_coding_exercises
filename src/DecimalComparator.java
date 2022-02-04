public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        String num1String = Double.toString(num1);
        String num2String = Double.toString(num2);

        int num1IndexOfDecimal = num1String.indexOf('.');
        int num2IndexOfDecimal = num2String.indexOf('.');

        if (num1String.length() > num1IndexOfDecimal + 3 && num2String.length() > num2IndexOfDecimal + 3 ) {
            String num1DecimalString = num1String.substring(0, num1IndexOfDecimal + 4);
            String num2DecimalString = num2String.substring(0, num2IndexOfDecimal + 4);
        double num1ConvertToDouble = Double.parseDouble(num1DecimalString);
        double num2ConvertToDouble = Double.parseDouble(num2DecimalString);
        System.out.println(num1ConvertToDouble);
        System.out.println(num2ConvertToDouble);

            if (num1ConvertToDouble == num2ConvertToDouble) {
                return true;
            }
        }
        if (num1 == num2) {
            return true;
        }
        return false;
    }
}

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(22, 14, 45));
        System.out.println(hasTeen2(22, 14, 45));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        boolean isTeen1 = age1 >= 13 && age1 <= 19;
        boolean isTeen2 = age2 >= 13 && age2 <= 19;
        boolean isTeen3 = age3 >= 13 && age3 <= 19;

        if (isTeen1 || isTeen2 || isTeen3) {
            return true;
        }
        return false;
    }

    // better way - use below overloading method where isTeen() is a helper method
    public static boolean hasTeen2(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }
}

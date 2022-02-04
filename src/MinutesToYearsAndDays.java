public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

//    public static void printYearsAndDays(long minutes) {
//        if (minutes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            long hours = minutes / 60;
//            long days = hours / 24;
//            int year = (int) days / 365;
//            long remainingdays = days - (year * 365);
//            System.out.println(minutes + " min = " + year + " y " + "and " + remainingdays + " d");
//        }
//    }

    // a better way with constants and % remainder
    private static final String INVALID_VALUE = "Invalid Value";
    private static final long DAYS_IN_A_YEAR = 365;
    private static final long HOURS_IN_A_DAY = 24;
    private static final long MINUTES_IN_A_DAY = 60;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long hours = minutes / MINUTES_IN_A_DAY;
            long days = hours / HOURS_IN_A_DAY;
            int year = (int) days / (int) DAYS_IN_A_YEAR;
            long remainingdays = days % DAYS_IN_A_YEAR;
            System.out.println(minutes + " min = " + year + " y " + "and " + remainingdays + " d");
        }
    }
}

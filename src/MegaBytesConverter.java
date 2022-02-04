public class MegaBytesConverter {

    public static void main(String[] args) {
//        System.out.println(2500 % 1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = 0;
            int kb = kiloBytes % 1024;
            mb = (kiloBytes - kb) / 1024;

            System.out.println(kiloBytes + " KB = " + mb + " MB" + " and " + kb + " KB");
        }
    }
}

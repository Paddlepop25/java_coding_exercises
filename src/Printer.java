public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this. pagesPrinted = 0;
    }

    public int addToner (int tonerAmount) {
        System.out.println("Toner added");
        if (tonerAmount > 0 && tonerLevel <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                System.out.println("Overflowing toner");
                return -1;
            } else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        System.out.println("Pages to print before duplex check: " + pages);
        int pagesToPrint = pages;
        if (duplex) {
            System.out.println("Printer is a duplex (print both sides of a page)");
            pagesToPrint = (pages / 2) + (pages % 2); // % is for the odd number of pages to print
            pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

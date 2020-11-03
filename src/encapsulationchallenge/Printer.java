package encapsulationchallenge;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }

        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount < 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }

        }else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.isDuplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("printing in duplex mode");
        }
        numberOfPagesPrinted += pages;
        return pagesToPrint;
    }
}

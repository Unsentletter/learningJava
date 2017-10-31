package com.Tristan;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int toner, int pagesPrinted, boolean duplexPrinter) {
        if (toner > 0 && toner < 101) {
            this.tonerLevel = toner;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int amountToFill) {
        if(tonerLevel >0 && amountToFill <= 100) {
            this.tonerLevel = this.tonerLevel + amountToFill;
        } else {
            this.tonerLevel = -1;
        }
    }

    public void printPage(int pages, boolean duplex) {
        if (!duplex) {
            this.pagesPrinted = this.pagesPrinted + pages;
            this.tonerLevel = this.tonerLevel - pages;
        }
        System.out.println("Duplex mode");
        this.pagesPrinted = this.pagesPrinted + (pages *2);
        this.tonerLevel = this.tonerLevel - (pages *2);
    }

    public int checkTonerLevels() {
        return tonerLevel;
    }
}

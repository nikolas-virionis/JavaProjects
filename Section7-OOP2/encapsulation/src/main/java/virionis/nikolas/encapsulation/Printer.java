package virionis.nikolas.encapsulation;

public class Printer {
    private int tonerLevel = 0;
    private int pagesPrinted = 0;
    private boolean duplex = false;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        if (tonerLevel >= 0 && tonerLevel <= 100) this.tonerLevel = tonerLevel;
        if(pagesPrinted >= 0) this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void fillToner(int tonerIncrement){
        if (tonerLevel < 100){
            if (tonerLevel + tonerIncrement > 100){
                System.out.println("Toner Level filled to the top, still " + (tonerLevel + tonerIncrement - 100) + " left to be incremented");
                this.tonerLevel = 100;
            }
            else if (tonerLevel + tonerIncrement == 100){
                this.tonerLevel = 100;
                System.out.println("Toner Level filled to the top, no more toner fillment left to be incremented");
            }
            else {
                this.tonerLevel += tonerIncrement;
                System.out.println("Toner Level at " + this.tonerLevel + "% of capacity");
            }
        }
        else System.out.println("Toner Level already at maximum capacity");
    }

    public void print(int pages) {
        int x = this.duplex ? 2 : 1;
        if (this.tonerLevel - (x * pages) < 0) System.out.println("Insuficcient toner level to print " + pages + " pages \n Toner necessary to print it: " + (x * pages));
        else {
            System.out.println("Printing " + (x * pages) + " pages in total");
            this.pagesPrinted += (x * pages);
            this.tonerLevel -= (x * pages);
        }
    }

    public boolean isDuplex() {
        return duplex;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }


}

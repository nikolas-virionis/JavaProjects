package virionis.nikolas.encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(0, 0, false);
        Printer printer2 = new Printer(100, 50, true);
        printer1.fillToner(50);
        printer1.fillToner(60);
        System.out.println(printer1.getPagesPrinted());
        System.out.println(printer2.getPagesPrinted());
        System.out.println(printer1.isDuplex());
        System.out.println(printer2.isDuplex());
        printer1.print(6);
        printer2.print(60);
    }
}

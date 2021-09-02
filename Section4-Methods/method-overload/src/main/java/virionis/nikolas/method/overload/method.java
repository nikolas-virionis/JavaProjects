package virionis.nikolas.method.overload;

public class method {
    public static void main(String[] args) {
        System.out.println(calcFtAndIntoCm(15) + "cm");
    }
    public static double calcFtAndInToCm(int feet, int inches) {
        System.out.println(feet);
        System.out.println(inches);
        if (feet < 0 || inches < 0 || inches > 12) return -1;
        return (12*feet + inches) * 2.54;
    }
    public static double calcFtAndIntoCm(int inches) {
        System.out.println(inches);
        if (inches < 0) return -1;
        int feet = inches / 12;
        inches %= 12;
        return calcFtAndInToCm(feet, inches);
    }
}

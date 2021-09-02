package ifthen;

public class ifThen2 {
    public static void main(String[] args) {
        double doubleValue1 = 20.00;
        double doubleValue2 = 80.00;
        double doubleSum = (doubleValue1 + doubleValue2) * 100.00;
        double remainder = doubleSum % 40.00;
        boolean remainderEqualsZero = remainder == 0;
        System.out.println(remainderEqualsZero);
        if (!remainderEqualsZero) System.out.println("Got some remainder");
    }
}

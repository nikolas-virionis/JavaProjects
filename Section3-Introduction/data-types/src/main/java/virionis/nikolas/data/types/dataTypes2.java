package datatypes;

public class dataTypes2 {
    public static void main(String[] args) {
        byte byteNum = Byte.MAX_VALUE;
        short shortNum = Short.MAX_VALUE - 2001;
        int intNum = Integer.MAX_VALUE - 2000000001;
        long longNum = 50000 + 10*(byteNum + shortNum + intNum);
        System.out.println(intNum + " " + longNum);
    }
}

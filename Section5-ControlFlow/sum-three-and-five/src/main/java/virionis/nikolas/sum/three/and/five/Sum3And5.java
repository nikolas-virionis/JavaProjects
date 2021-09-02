package virionis.nikolas.sum.three.and.five;
public class Sum3And5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 15 == 0) {
                sum += i;
                System.out.println(i);
                if (++count >= 5) break;
            }
        }
        System.out.println("Total Sum = " + sum);
    }
}

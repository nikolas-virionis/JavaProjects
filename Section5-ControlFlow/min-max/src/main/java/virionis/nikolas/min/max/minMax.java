package virionis.nikolas.min.max;
import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number > max) max = number;
                if (number < min) min = number;
            } 
            else break;
            scanner.nextLine();
        }
        System.out.println("Max Number: " + max + " / Min Number: " + min);
        scanner.close();
    }
}

package virionis.nikolas.user.input;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 10){
            System.out.println("Enter number " + (count + 1) + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } 
            else System.out.println("NUmber " + (count + 1) + " is Invalid");
            scanner.nextLine();
        }
        System.out.println("Sum of all ten numbers = " + sum);
        scanner.close();
    }
}

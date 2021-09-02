package virionis.nikolas.reverse.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        reverse(new int[]{1, 2, 3});
    }
    public static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            reverseArray[i] = array[array.length - (i + 1)];
        System.out.println("OG array: " + Arrays.toString(array));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray));
    }
}

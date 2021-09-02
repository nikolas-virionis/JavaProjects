package ifthen;

public class ifThen1 {
    public static void main(String[] args) {
        boolean isAlien = false;
        boolean isHuman = true;
        if (isAlien) System.out.println("It is an Alien");
        else System.out.println("It is not an alien"); // same as if (!isAlien)
        System.out.println(isAlien || isHuman);
        System.out.println(isAlien && isHuman);

    }
}

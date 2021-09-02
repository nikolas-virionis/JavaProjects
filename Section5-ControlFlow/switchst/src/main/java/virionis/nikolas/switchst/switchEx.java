package virionis.nikolas.switchst;

public class switchEx {
    public static void main(String[] args) {
        String key = "Abc";
        switch (key) {
            case "Abc":
                System.out.println("It is A");
                break;
            case "B":
                System.out.println("It is B");
                break;
            case "C":
                System.out.println("It is C");
                break;
            case "D":
                System.out.println("It is D"); 
                break;
            case "E":
                System.out.println("It is E");    
                break;
        
            default:
            System.out.println("404 Not Found");
                break;
        }
}
}
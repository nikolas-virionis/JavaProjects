package mobilephonecontacts;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phone.viewContacts();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("New Contact name: ");
        String name = scanner.nextLine();
        System.out.print("New Contact Phone number: ");
        String number = scanner.nextLine();

        Contact newContact = new Contact(name, number);
        if(phone.addContact(newContact)) System.out.println("Contact created successfully");
        else System.out.println("Contact already in contact list, press 3 do update its phone number or 4 to remove it");
    }

    public static void modifyItem() {
        System.out.print("Current contact name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newItem = scanner.nextLine();
        if (phone.updateContact(itemNo, newItem)) System.out.println("Contact updated successfully");
        else System.out.println("Contact non existant, press 2 to add a new one");
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        if (phone.removeContact(itemNo)) System.out.println("Contact removed successfully");
        else System.out.println("Contact non existant, press 1 to see list of contacts");
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(phone.onList(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }

}
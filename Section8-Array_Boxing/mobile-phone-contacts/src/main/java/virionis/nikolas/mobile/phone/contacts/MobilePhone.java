package virionis.nikolas.mobile.phone.contacts;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> listOfContacts = new ArrayList<Contact>();
    
    public boolean addContact(Contact contact){
        if (findContact(contact.getName()) >= 0)
            return false;
        listOfContacts.add(contact);
        return true;
    }

    public boolean updateContact(String name, String phoneNumber){
        int position = findContact(name);
        if (position < 0) return false;

        Contact newContact = listOfContacts.get(position);
        newContact.setPhoneNumber(phoneNumber);
        updateContact(position, newContact);
        return true;
    }
    private void updateContact(int position, Contact newContact){
        listOfContacts.set(position, newContact);
    }

    public boolean removeContact(String name){
        int position = findContact(name);
        if (position >= 0) {
            removeContact(position);
            return true;
        }
        return false;
    }
    private void removeContact(int position){
        listOfContacts.remove(position);
    }

    public int findContact(String name){
        for (int i = 0; i < this.listOfContacts.size(); i++) {
            if (this.listOfContacts.get(i).getName().toLowerCase().trim().equals(name.toLowerCase().trim())) 
                return i;
        }

        return -1;
    }

    public void viewContacts(){
        if (listOfContacts.size() > 0) {
            System.out.println("You have " + listOfContacts.size() + " contacts in your list");
            for (int i = 0; i < listOfContacts.size(); i++)
                System.out.println((i + 1) + ". " + listOfContacts.get(i).getName() + ": " + listOfContacts.get(i).getPhoneNumber());
        }
        else System.out.println("You have no contacts in your list yet, add one by pressing 2");
    }

    public String showPhoneNumber(String name) {
        int position = findContact(name);
        return showPhoneNumber(listOfContacts.get(position));
    }
    
    private String showPhoneNumber(Contact contact) {
        return contact.getPhoneNumber();
    }

    public boolean onList(String name) {
        int position = findContact(name);
        return onList(listOfContacts.get(position));
    }
    private boolean onList(Contact contact) {
        return listOfContacts.contains(contact);
        
    }
}

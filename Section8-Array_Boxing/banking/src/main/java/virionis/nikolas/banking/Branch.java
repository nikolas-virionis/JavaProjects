package virionis.nikolas.banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double amount) {
        if (findCustomer(name) >= 0)
            return false;
        customers.add(new Customer(name, amount));
        return true;
    }

    public boolean addTransaction(String name, double amount) {
        if (findCustomer(name) < 0)
            return false;
        customers.get(findCustomer(name)).addTransaction(amount);
        return true;
    }

    public int findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++)
            if (customers.get(i).getName().equals(name))
                return i;
        return -1;
    }

}

package virionis.nikolas.banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branch) {
        if (findBranch(branch) >= 0)
            return false;
        branches.add(new Branch(branch));
        return true;
    }

    public int findBranch(String name) {
        for (int i = 0; i < branches.size(); i++)
            if (branches.get(i).getName().equals(name))
                return i;
        return -1;
    }

    public boolean addCustomer(String branchName, String name, double amount) {
        if (findBranch(branchName) < 0)
            return false;
        Branch branch = branches.get(findBranch(branchName));
        branch.addCustomer(name, amount);
        return true;
    }

    public boolean addTransaction(String branchName, String name, double amount) {
        if (findBranch(branchName) < 0)
            return false;
        Branch branch = branches.get(findBranch(branchName));
        branch.addTransaction(name, amount);
        return true;
    }

    public void listCustomers(String branchName, boolean transaction) {
        listCustomers(branchName, transaction, "");
    }

    public boolean listCustomers(String branchName, boolean transaction, String comp) {
        if (findBranch(branchName) < 0)
            return false;

        Branch branch = branches.get(findBranch(branchName));
        System.out.println(comp + "There are " + branch.getCustomers().size() + " customers in this branch");
        ArrayList<Customer> customers = branch.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(comp + (i + 1) + ". " + customers.get(i).getName());
            if (transaction) {
                ArrayList<Double> transactions = customers.get(i).getTransactions();
                double sum = 0;
                System.out.println(comp + "\t" + "Transactions:");
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println(comp + "\t\t" + (j + 1) + ") $" + transactions.get(j));
                    sum += (transactions.get(j).doubleValue());
                }
                System.out.println(comp + "Total value of transactions: $" + sum);
            }
            System.out.println();
        }

        return true;
    }

    public void showBranches() {
        System.out.println("There are " + branches.size() + " branches in this bank");
        for (int i = 0; i < branches.size(); i++)
            System.out.println((i + 1) + ". " + branches.get(i).getName());
        System.out.println();
    }

    public boolean fullAnalysis(boolean transaction) {
        if (branches.size() <= 0)
            return false;

        for (int i = 0; i < branches.size(); i++) {
            String branch = branches.get(i).getName();

            System.out.println((i + 1) + "- " + branch);
            listCustomers(branch, transaction, "\t");
        }

        return true;
    }

}
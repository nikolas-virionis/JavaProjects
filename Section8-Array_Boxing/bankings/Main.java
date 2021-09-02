package banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");
        // if (bank.addBranch("Adelaide"))
        // System.out.println("Adelaide branch created");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);
        bank.addCustomer("Sydney", "Nick", 210.54);

        bank.addTransaction("Adelaide", "Tim", 44.22);
        bank.addTransaction("Adelaide", "Tim", 12.44);
        bank.addTransaction("Adelaide", "Mike", 1.65);

        // bank.listCustomers("Adelaide", true);
        // bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        bank.showBranches();
        bank.fullAnalysis(true);

        // if (!bank.addCustomer("Melbourne", "Brian", 5.53))
        // System.out.println("Error Melbourne branch does not exist");

        // if (!bank.addBranch("Adelaide"))
        // System.out.println("Adelaide branch already exists");

        // if (!bank.addTransaction("Adelaide", "Fergus", 52.33))
        // System.out.println("Customer does not exist at branch");

        // if (!bank.addCustomer("Adelaide", "Tim", 12.21))
        // System.out.println("Customer Tim already exists");
    }
}

package methodchallenge1;
public class Main {
    public static void main(String[] args) {
        //BankAcc acc = new BankAcc();
        // acc.setAccNumber(1234);
        // acc.setFirstName("Nikolas");
        // acc.setBalance(99999.99);
        // acc.setEmail("nikolas.virionis@gmail.com");
        // acc.setLastName("Virionis");
        // acc.setPhoneNumber("123456789");
        BankAcc acc = new BankAcc(1234, 99999.99, "Nikolas", "Virionis", "nikolas.virionis@gmail.com", "123456789");
        System.out.println("Account: " + acc.getAccNumber());
        System.out.println("Name: " + acc.getFullName());
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Email: " + acc.getEmail());
        System.out.println("Phone Number: " + acc.getPhoneNumber());
        acc.withdraw(100000000);
        System.out.println();
        acc.deposit(100000000);
        acc.withdraw(100000000);
    }
}

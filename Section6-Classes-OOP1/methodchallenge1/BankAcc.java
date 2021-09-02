package methodchallenge1;
public class BankAcc {
    private int accNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // *************************************
    // contructor Methods
    public BankAcc(){
        this(1234, 0.00, "Name", "Last Name", "name.lastname@gmail.com", "987654321");
    }
    public BankAcc(int acc, double balance, String firstName, String lastName, String email, String phoneNumber){
        this.accNumber = acc;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    // *************************************

    public int getAccNumber() {
        return this.accNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setAccNumber(int acc) {
        this.accNumber = acc;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setLastName(String name) {
        this.lastName = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    public void deposit(double value){
        if (value > 0) {
            this.balance += value;
            System.out.println("$" + value + " deposited successfully");
            System.out.println("Current balance: " + this.balance);
        }
        else System.out.println("Invalid deposit value");
    }
    public void withdraw(double value){
        if (value <= this.balance) {
            this.balance -= value;
            System.out.println("$" + value + " withdrawn successfully");
            System.out.println("Current balance: " + this.balance);
        }
        else System.out.println("Insufficient funds");
    }
}

package methodchallenge2;

public class VipCostumer {
    private String name;
    private String email;
    private double limit;

    public VipCostumer(){
        this("Name", "name.lastname@gmail.com", 999.99);
    }
    public VipCostumer(String name, String email){
        this(name, email, 999.99);
    }
    public VipCostumer(String name, String email, double limit){
        this.name = name;
        this.email = email;
        this.limit = limit;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public double getLimit(){
        return this.limit;
    }
}

package compostion;

public class Mattress {
    private String name;
    private String manufacturer;
    
    public Mattress(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getName() {
        return name;
    }

    public void warmUp() {
        System.out.println("Mattress Warm");
    }
}

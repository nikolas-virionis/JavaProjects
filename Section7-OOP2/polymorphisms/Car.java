package polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels = 4;
    private String name;

    public Car(boolean engine, int cylinders, String name) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;

    }

    public void accelerate(){
        System.out.println(this.name + " accelerating");
    }
    public void breaking(){
        System.out.println(this.name + " breaking");
    }

    public void startEngine(){
        System.out.println("No engine");
    }
    
    public String useless(){
        return "" + engine + cylinders + "";
    }
    public String hasEngine() {
        return "No Engine";
    }
    public String getCylinders() {
        return "No Cylinders";
    }
    public String getName() {
        return name;
    }
    public int getWheels() {
        return wheels;
    }

}

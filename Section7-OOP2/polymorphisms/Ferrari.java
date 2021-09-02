package polymorphism;

public class Ferrari extends Car {

    public Ferrari(boolean engine, int cylinders, String name) {
        super(engine, cylinders, name);
        
    }
    public void accelerate(){
        System.out.println(this.getName() + " accelerating");
    }
    public void breaking(){
        System.out.println(this.getName() + " breaking");
    }

    public void startEngine(){
        System.out.println("Engine start");
    }
    
    public String hasEngine() {
        return "Has an engine";
    }
    public String getCylinders() {
        return "8 cylinders";
    }
    
}

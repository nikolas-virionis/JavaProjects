package polymorphism;

public class F1 extends Car{

    public F1(boolean engine, int cylinders, String name) {
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
        return "12 cylinders";
    }
    
}

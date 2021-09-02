package polymorphism;

public class Tesla extends Car {

    public Tesla(boolean engine, int cylinders, String name) {
        super(engine, cylinders, name);
        
    }
    
    public void accelerate(){
        System.out.println(this.getName() + " accelerating");
    }
    public void breaking(){
        System.out.println(this.getName() + " breaking");
    }

}

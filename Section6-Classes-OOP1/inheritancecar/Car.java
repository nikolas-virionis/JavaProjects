package inheritancecar;

public class Car extends Vehicle{
    private int wheels;
    protected int gear;
    protected int maxGear;
    
    public Car(String name, String color, int seats, int wheels, int steering, int maxGear){
        super(name, color, seats, steering, "car");
        this.wheels = wheels;
        this.gear = 1;
        this.maxGear = maxGear;
    }

    public void showData(){
        super.showData();
        System.out.println("Wheels: " + this.wheels + "\n" + "Current Gear: " + this.gear + "\n" + "Maximum Gear: " + this.maxGear);
    }

    public void gearUp(){
        if (gear < maxGear) gear++;
        else System.out.println("Maximum gear already achieved");
    }
    public void gearDown(){
        if (gear > 1) gear--;
    }
}

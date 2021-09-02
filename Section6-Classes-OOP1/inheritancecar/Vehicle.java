package inheritancecar;

public class Vehicle {
    protected String name;
    protected String color;
    protected int seats;
    protected int speed;
    protected int steering;
    protected String type;

    public Vehicle(String name, String color, int seats, int steering, String type) {
        this.name = name;
        this.color = color;
        this.seats = seats;
        this.steering = steering;
        this.type = type;
        this.speed = 0;
    }

    public void accelerate(int speed){
        this.speed += speed;
    }

    
    public void showData(){
        System.out.println("Name: " + this.name + "\n" + "Color: " + this.color + "\n" + "Seats: " + this.seats + "\n" + "Type: " + this.type + "\n" + "Speed: " + this.speed);
    }

    public void reverse(int speed){
        if (this.speed <= 0) this.speed -= speed;
        else System.out.println("Prior to reversing, stop the vehicle");
    }
    public void breakVehicle(int breakSpeed){
        if (this.speed >= 0){
            if (this.speed >= breakSpeed) this.speed -= breakSpeed;
            else if (this.speed - breakSpeed > breakSpeed * -1) this.speed = 0;
            else {
                System.out.println(this.type + " already stationary!");
                return;
            }
        }
        else {
            if (this.speed <= breakSpeed) this.speed += breakSpeed;
            else if (this.speed + breakSpeed < breakSpeed * -1) this.speed = 0;
            else {
                System.out.println(this.type + " already stationary!");
                return;
            }
        }
    }
}

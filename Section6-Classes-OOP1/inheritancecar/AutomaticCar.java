package inheritancecar;

public class AutomaticCar extends Car{
    private int rpm;
    private int maxRpm;
    public AutomaticCar(String name, String color, int seats, int wheels, int steering, int maxGear, int maxRpm){
        super(name, color, seats, wheels, steering, maxGear);
        this.rpm = 0;
        this.maxRpm = maxRpm;
    }

    public void rpmUp(int rpm){
        if (this.rpm + rpm <= this.maxRpm) this.rpm += rpm;
        else {
            this.rpm = this.maxRpm;
            System.out.println("Warning: Maximum rpm reached");
        }
        while (this.rpm / this.gear > 100) super.gearUp();
    }
    public void rpmDown(int rpm){
        if (this.rpm >= rpm) this.rpm -= rpm;
        else return;
        while (this.rpm / this.gear < 100) super.gearDown();
    }

    public void showData(){
        super.showData();
        System.out.println("Current rpm: " + this.rpm + "\n" + "Maximum rpm: " + this.maxRpm + "\n");
    }

    @Override
    public void accelerate(int speed){
        super.accelerate(speed);
        rpmUp(speed * 10);
    }

    @Override
    public void reverse(int speed){
        super.reverse(speed);
        rpmUp(speed * 20);
    }
    @Override
    public void breakVehicle(int breakSpeed){
        super.breakVehicle(breakSpeed);
        int param = speed < 0 ? breakSpeed * 20 : breakSpeed * 10;
        rpmDown(param);
    }
}

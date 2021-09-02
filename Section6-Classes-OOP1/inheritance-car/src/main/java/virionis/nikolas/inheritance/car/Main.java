package virionis.nikolas.inheritance.car;

public class Main {
    public static void main(String[] args) {
        AutomaticCar teslaModelS = new AutomaticCar("Tesla Model S",
                "Red", 4, 4, 0, 6, 600);
        teslaModelS.accelerate(40);
        teslaModelS.breakVehicle(40);
        teslaModelS.showData();
    }
}
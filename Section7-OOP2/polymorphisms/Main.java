package polymorphism;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            Car random = randomCar();
            random.accelerate();
            random.breaking();
            random.startEngine();
            System.out.println(random.getName());
            System.out.println(random.hasEngine());
            System.out.println("##########################################");
        }        
    }
    public static Car randomCar(){
            int random = (int) (Math.random() * 2) + 1;
            switch (random) {
                case 1:
                    return new Tesla(false, 0, "Tesla");
                case 2:
                    return new Ferrari(true, 8, "Ferrari");
                case 3:
                    return new F1(true, 12, "F1");
            }
            return new Tesla(false, 0, "Tesla");
        }
}


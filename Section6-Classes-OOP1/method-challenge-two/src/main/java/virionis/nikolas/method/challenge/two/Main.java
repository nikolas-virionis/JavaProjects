package virionis.nikolas.method.challenge.two;

public class Main {
    public static void main(String[] args) {
        VipCostumer vip = new VipCostumer("nikolas", "nikolas@gmail.com", 1000000);
        System.out.println(vip.getName());
        System.out.println(vip.getEmail());
        System.out.println(vip.getLimit());
    }
}

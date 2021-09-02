package compostion;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(2, 2, 1, 6, 3);
        Mattress mattress = new Mattress("King Size", "Emma");
        Bed bed = new Bed(1, 2, mattress);
        Desk desk = new Desk("Lenovo", "Fortrek", "Logitech");
        
        Room room = new Room(3, 2, wardrobe, bed, desk);
        room.getBed().warm();
        desk.turnMonitorOn();
        bed.layDown();
        wardrobe.openDoors();
    }
}

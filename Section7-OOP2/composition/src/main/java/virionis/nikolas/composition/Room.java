package virionis.nikolas.composition;

public class Room {
    private int depth;
    private int length;
    private Wardrobe wardrobe;
    private Bed bed;
    private Desk desk;

    public Room(int depth, int length, Wardrobe wardrobe, Bed bed, Desk desk) {
        this.depth = depth;
        this.length = length;
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.desk = desk;
    }
    
    public int getDepth(){
        return depth;
    }
    public int getLength(){
        return length;
    }
    public Wardrobe getWardrobe(){
        return wardrobe;
    }
    public Bed getBed(){
        return bed;
    }
    public Desk getDesk(){
        return desk;
    }
}
package virionis.nikolas.composition;

public class Bed {
    private int width;
    private int length;
    private Mattress mattress;

    public Bed(int width, int length, Mattress mattress) {
        this.width = width;
        this.length = length;
        this.mattress = mattress;
    }

    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }

    public void layDown() {
        System.out.println("Lay down");
    }
    public void warm(){
        mattress.warmUp();
    }
}

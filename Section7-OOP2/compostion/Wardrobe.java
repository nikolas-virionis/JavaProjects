package compostion;

public class Wardrobe {
    private int height;
    private int length;
    private int depth;
    private int doors;
    private int drawer;

    public Wardrobe(int height, int length, int depth, int doors, int drawer) {
        this.height = height;
        this.length = length;
        this.depth = depth;
        this.doors = doors;
        this.drawer = drawer;
    }
    public void openDoors() {
        System.out.println("Doors open");
    }

    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }
    public int getDepth() {
        return depth;
    }
    public int getDoors() {
        return doors;
    }
    public int getDrawer() {
        return drawer;
    }

}
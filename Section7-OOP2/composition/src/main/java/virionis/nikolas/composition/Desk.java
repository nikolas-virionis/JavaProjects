package virionis.nikolas.composition;

public class Desk {
    private String monitor;
    private String keyboard;
    private String mouse;

    public Desk(String monitor, String keyboard, String mouse) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public String getMouse() {
        return mouse;
    }
    public String getKeyboard() {
        return keyboard;
    }
    public String getMonitor() {
        return monitor;
    }

    public void turnMonitorOn() {
        System.out.println("Monitor turned on");
    }
}
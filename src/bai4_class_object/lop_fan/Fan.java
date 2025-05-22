package bai4_class_object.lop_fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.isOn() == true) {
            return "Speed: " + this.getSpeed() + "; " + "Color: " + this.getColor() + "; " + "Radius: " + this.getRadius() + "; " +
                    "Fan is on";
        } else {
            return "Speed: " + this.getSpeed() + "; " + "Color: " + this.getColor() + "; " + "Radius: " + this.getRadius() + "; " +
                    "Fan is off";
        }
    }
}

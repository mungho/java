package Bai5_access_modifier.access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "Red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}

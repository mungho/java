package Bai6_inheritance.Circle_Cylinder;

public class Circle {
    private double radius;
    private String color;
    static final double PI = 3.14;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double circleArea() {
        return this.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "[" + "radius: " + this.getRadius() +
                "; color: " + this.getColor() + "]";
    }
}

package Bai6_inheritance.Circle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double volumeCylinder() {
        return this.circleArea() * this.height;
    }

    @Override
    public String toString() {
        return "[" + "radius: " + this.getRadius() +
                "; height: " + this.height +
                "; color: " + this.getColor() + "]";
    }
}

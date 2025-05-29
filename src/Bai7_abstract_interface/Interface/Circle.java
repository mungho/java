package Bai7_abstract_interface.Interface;

public class Circle implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * (1 + percent / 100);
    }
}

package Bai7_abstract_interface.ColorableInterface;

public class Square implements Colorable{
    private double width;
    private double height;

    public Square() {
    }

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double squareArea() {
        return this.height * this.width;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

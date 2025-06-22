package Bai15_exception.model.entity;

public class Triangle {
    private Float firstSide;
    private Float secondSide;
    private Float thirdSide;

    public Triangle(){}

    public Triangle(Float firstSide, Float secondSide, Float thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public String toString() {
        return "[" + this.firstSide + ", " + this.secondSide + ", " + this.thirdSide + "]";
    }
}

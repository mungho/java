package Bai7_abstract_interface.ColorableInterface;

public class Controller {
    public static void main(String[] args) {
        Square square1 = new Square(2, 4);
        Square square2 = new Square(3, 6);

        Square[] shape = {square1, square2};

        for (int i = 0; i < shape.length; i++) {
            System.out.println("Square Area " + (i+1) + ": " + shape[i].squareArea() );
        }
    }
}

package Bai7_abstract_interface.Interface;

public class Controller {
    public static void main(String[] args) {
        Square square = new Square(5, 10);
        System.out.println(square.squareArea());
        square.resize(100);
        System.out.println(square.squareArea());
    }
}

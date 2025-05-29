package Bai6_inheritance.Circle_Cylinder;

public class Controller {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 10, "blue");
        System.out.println(cylinder.volumeCylinder());
        System.out.println(cylinder);
    }
}

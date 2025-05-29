package Bai6_inheritance.PointMoveablePoint;

public class Controller {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(0, 0, 1, 2);
        moveablePoint.move().move().move().move();
        System.out.println(moveablePoint);
    }
}

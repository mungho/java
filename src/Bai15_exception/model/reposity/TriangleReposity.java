package Bai15_exception.model.reposity;

import Bai15_exception.model.entity.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleReposity {
    List<Triangle> triangleList = new ArrayList<>();

    public boolean inputTriangleSide(Float firstSide, Float secondSide, Float thirdSide) {
        try{
            Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}

package Bai15_exception.model.service;

import Bai15_exception.model.entity.Triangle;
import Bai15_exception.model.reposity.TriangleReposity;

public class TriangleService {
    TriangleReposity triangleReposity = new TriangleReposity();

    public boolean inputTriangleSide(Float firstSide, Float secondSide, Float thirdSide) {
        try{
            triangleReposity.inputTriangleSide(firstSide, secondSide, thirdSide);
            return true;
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}

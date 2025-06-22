package Bai15_exception.controller;

import Bai15_exception.model.service.TriangleService;

public class TriangleController {
    TriangleService triangleService = new TriangleService();

    public boolean inputTriangleSide(Float firstSide, Float secondSide, Float thirdSide) {
        try{
            triangleService.inputTriangleSide(firstSide, secondSide, thirdSide);
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}

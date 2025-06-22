package Bai15_exception.view;

import java.util.Scanner;

public class TriangleView {
    Scanner scanner = new Scanner(System.in);

    public void inputTriangleSide() {
        try{
            System.out.println("Enter the first side:");
            float firstSide = Float.parseFloat(scanner.nextLine());
            if (firstSide <= 0) {
                throw new IllegalArgumentException("Side is invalid");
            }
            System.out.println("Enter the second side:");
            float secondSide = Float.parseFloat(scanner.nextLine());
            if (secondSide <= 0) {
                throw new IllegalArgumentException("Side is invalid");
            }

            System.out.println("Enter the third side:");
            float thirdSide = Float.parseFloat(scanner.nextLine());
            if (thirdSide <= 0) {
                throw new IllegalArgumentException("Side is invalid");
            }

            if (firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
                throw new IllegalArgumentException("The sum of any two sides must be greater than the third");
            }

            System.out.println("Triangle is valid!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

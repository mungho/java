package bai4_class_object.phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadraticEquation {
    private double leadingCoefficientValue;
    private double coefficientValue;
    private double constantValue;

    public double getLeadingCoefficientValue() {
        return leadingCoefficientValue;
    }

    public double getCoefficientValue() {
        return coefficientValue;
    }

    public double getConstantValue() {
        return constantValue;
    }

    public void setleadingCoefficientValue(double leadingCoefficientValue) {
        this.leadingCoefficientValue = leadingCoefficientValue;
    }

    public void setCoefficientValue(double coefficientValue) {
        this.coefficientValue = coefficientValue;
    }

    public void setConstantValue(double constantValue) {
        this.constantValue = constantValue;
    }

    public double getDiscriminant() {
        return Math.pow(this.coefficientValue, 2) - 4 * this.leadingCoefficientValue * this.constantValue;
    }

    public double getRoot1() {
        return ((-this.coefficientValue) + Math.pow(getDiscriminant(), 0.5)) / (2 * this.leadingCoefficientValue);
    }


    public double getRoot2() {
        return ((-this.coefficientValue) - Math.pow(getDiscriminant(), 0.5)) / (2 * this.leadingCoefficientValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("Please enter a leading coefficient");
        quadraticEquation.setleadingCoefficientValue(Double.parseDouble(scanner.nextLine()));
        System.out.println("Please enter a coefficient value");
        quadraticEquation.setCoefficientValue(Double.parseDouble(scanner.nextLine()));
        System.out.println("Please enter a constant value");
        quadraticEquation.setConstantValue(Double.parseDouble(scanner.nextLine()));

        if (quadraticEquation.getLeadingCoefficientValue() != 0) {
            if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("The equation has two solutions: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("The equation has one solution: " + quadraticEquation.getRoot1());
            } else {
                System.out.println("The equation has no solution");
            }
        } else if (quadraticEquation.getCoefficientValue() != 0) {
            System.out.println("The equation has one solution: " + -quadraticEquation.getConstantValue()/quadraticEquation.getCoefficientValue());
        } else if (quadraticEquation.getConstantValue() != 0) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("The equation has infinitely many solutions");
        }
    }
}

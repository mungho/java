package bai3_array_method;

import java.util.Scanner;

public class Bai6_thao_tac_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of array");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of array");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the column to sum?");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] numberArray = new int[height][width];
        numberArray = createNewArray(height, width);
        System.out.println("Total value of column " + column + " is: " + totalColumn(numberArray, column));
    }

    public static int[][] createNewArray(int height, int width) {
        Scanner scanner = new Scanner(System.in);
        int[][] tempArray = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Enter array value: [" + i + "][" + j + "]");
                tempArray[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return tempArray;
    }

    public static int totalColumn(int[][] tempArray, int column) {
        int sum = 0;
        for (int i = 0; i < tempArray.length; i++) {
            sum += tempArray[i][column];
        }
        return sum;
    }
}

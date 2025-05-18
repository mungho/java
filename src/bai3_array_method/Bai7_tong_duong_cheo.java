package bai3_array_method;

import java.util.Scanner;

public class Bai7_tong_duong_cheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of array");
        int side = Integer.parseInt(scanner.nextLine());
        int[][] numberArray = new int[side][side];
        numberArray = createNewArray(side, side);
        System.out.println("Sum of diagonal is: " + sumDiagonal(numberArray));
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

    public static int sumDiagonal(int[][] tempArray) {
        int sum = 0;
        for (int i = 0; i < tempArray.length; i++) {
            sum += tempArray[i][i];
        }
        return sum;
    }
}

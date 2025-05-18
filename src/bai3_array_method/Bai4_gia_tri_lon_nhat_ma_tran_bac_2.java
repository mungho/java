package bai3_array_method;

import java.util.Scanner;

public class Bai4_gia_tri_lon_nhat_ma_tran_bac_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of array");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of array");
        int width = Integer.parseInt(scanner.nextLine());
        int[][] numberArray = new int[height][width];
        numberArray = createNewArray(height, width);
        int[] maxResult = checkMax(numberArray);
        System.out.println("Max value is: " + maxResult[0]);
        System.out.println("Position of max value is: [" + maxResult[1] + "][" + maxResult[2] + "]");
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

    public static int[] checkMax(int[][] tempArray) {
        int maxValue = tempArray[0][0];
        int tempresult[] = new int[3];
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray[i].length; j++) {
                if (tempArray[i][j] > maxValue) {
                    maxValue = tempArray[i][j];
                    tempresult[0] = maxValue;
                    tempresult[1] = i;
                    tempresult[2] = j;
                }
            }
        }
        return tempresult;
    }
}

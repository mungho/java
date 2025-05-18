package bai3_array_method;

import java.util.Scanner;

public class Bai5_gia_tri_nho_nhat_ma_tran_bac_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of array");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of array");
        int width = Integer.parseInt(scanner.nextLine());
        int[][] numberArray = new int[height][width];
        numberArray = createNewArray(height, width);
        int[] maxResult = checkMin(numberArray);
        System.out.println("Min value is: " + maxResult[0]);
        System.out.println("Position of min value is: [" + maxResult[1] + "][" + maxResult[2] + "]");
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

    public static int[] checkMin(int[][] tempArray) {
        int minValue = tempArray[0][0];
        int tempresult[] = new int[3];
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray[i].length; j++) {
                if (tempArray[i][j] < minValue) {
                    minValue = tempArray[i][j];
                    tempresult[0] = minValue;
                    tempresult[1] = i;
                    tempresult[2] = j;
                }
            }
        }
        return tempresult;
    }
}

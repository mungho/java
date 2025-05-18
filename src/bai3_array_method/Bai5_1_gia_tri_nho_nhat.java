package bai3_array_method;

import java.util.Scanner;

public class Bai5_1_gia_tri_nho_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers of value in array");
        int numb = Integer.parseInt(scanner.nextLine());
        int[] numberArray = new int[numb];
        numberArray = inputArray(numb);
        System.out.println("Min value is: " + checkMin(numberArray));

    }

    public static int[] inputArray(int numberArrayValue) {
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[numberArrayValue];
        for (int i = 0; i < numberArrayValue; i++) {
            System.out.println("Please enter the array value " + i);
            newArray[i] = Integer.parseInt(scanner.nextLine());
        }
        return newArray;
    }

    public static int checkMin(int[] tempArray) {
        int minValue = tempArray[0];
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] < minValue) {
                minValue = tempArray[i];
            }
        }
        return minValue;
    }
}

package bai3_array_method;

import java.util.Scanner;

public class Bai3_gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number values of first array");
        int firstNumberValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number values of second array");
        int secondNumberValue = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[firstNumberValue];
        firstArray = inputArray(firstNumberValue);
        String[] secondArray = new String[secondNumberValue];
        secondArray = inputArray(secondNumberValue);
        String[] thirdArray = new String[firstNumberValue + secondNumberValue];
        thirdArray = combineArray(firstArray, secondArray);
        runArray(thirdArray);
    }

    public static String[] inputArray(int numberArrayValue) {
        Scanner scanner = new Scanner(System.in);
        String[] newArray = new String[numberArrayValue];
        for (int i = 0; i < numberArrayValue; i++) {
            System.out.println("Please enter the array value " + i);
            newArray[i] = scanner.nextLine();
        }
        return newArray;
    }

    public static String[] combineArray(String[] firstArray, String[] secondArray) {
        String[] newArray = new String[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length + secondArray.length; i++) {
            if (i < firstArray.length) {
                newArray[i] = firstArray[i];
            } else {
                newArray[i] = secondArray[i - firstArray.length];
            }
        }
        return newArray;
    }

    public static void runArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value " + i + " in array: " + arr[i]);
        }
    }
}

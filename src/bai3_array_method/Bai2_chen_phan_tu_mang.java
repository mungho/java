package bai3_array_method;

import java.util.Scanner;

public class Bai2_chen_phan_tu_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number values of array: ");
        int numberValue = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[numberValue+1];
        inputArray(numberValue, arr);
        System.out.println("Enter the position which you want to insert: ");
        int numb = Integer.parseInt(scanner.nextLine());
        arr = insertValueInArray(numb, arr);
        runArray(arr);
    }

    public static String[] inputArray(int numberValue, String[] tempArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberValue; i++) {
            System.out.println("Enter the value " + i + " in array");
            tempArray [i] = scanner.nextLine();
        }
        return tempArray;
    }

    public static String[] insertValueInArray (int numb, String[] arr) {
        int index = 0;
        String[] newArray = new String[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            if (numb == i) {
                newArray[index++] = "X";
                i--;
                numb = -1;
            } else {
                newArray[index++] = arr[i];
            }
        }
        return newArray;
    }

    public static void runArray (String[] tempArray) {
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println("The " + i + " in array: " + tempArray[i]);
        }
    }
}

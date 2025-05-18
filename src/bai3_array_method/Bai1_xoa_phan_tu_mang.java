package bai3_array_method;

import java.util.Scanner;

public class Bai1_xoa_phan_tu_mang {
    public static void main(String[] args) {
        int[] arr = new int[5];
        inputArray(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number which you want to delete: ");
        int numb = Integer.parseInt(scanner.nextLine());
        arr = deleteValueInArray(numb, arr);
        runArray(arr);
    }

    public static int[] inputArray(int[] tempArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println("Enter the value " + i + " in array");
            tempArray [i] = Integer.parseInt(scanner.nextLine());
        }
        return tempArray;
    }

    public static int[] deleteValueInArray (int numb, int[] arr) {
        int index = 0;
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (numb == arr[i]) {
//                i++;
            } else {
                newArray[index++] = arr[i];
            }
        }
        return newArray;
    }

    public static void runArray (int[] tempArray) {
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println("The " + i + " in array: " + tempArray[i]);
        }
    }
}

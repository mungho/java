package Bai15_sort_algorithm;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {1, 8, 4, 9, 6, 4, 7, 1, 3,0};
        int temp;
        int pos = 0;

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            while (pos >= 0 && temp < array[pos]) {
                array[pos+1] = array[pos];
                pos--;
            }
            array[pos+1] = temp;
            pos = i;

            System.out.print("Step " + (i+1) + ": ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "; ");
            }
            System.out.println("\n");
        }
    }
}

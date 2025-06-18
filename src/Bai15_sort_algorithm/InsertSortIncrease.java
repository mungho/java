package Bai15_sort_algorithm;

public class InsertSortIncrease {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 3, 9, 4, 6,15845,0};
        insertSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void insertSort(int[] array) {
        int temp;
        int pos;

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            pos = i;
            while ( pos > 0 && temp < array[pos-1]) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = temp;

        }
    }
}

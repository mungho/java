package Bai15_sort_algorithm;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 3, 9, 4, 6,15845,0};

        InsertSortIncrease insertSortIncrease = new InsertSortIncrease();
        insertSortIncrease.insertSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

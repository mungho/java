package Bai14_search_algorithm;

import java.util.Scanner;

public class SearchAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        //Tạo mảng thay vì java không cho phép chỉnh sửa ngay trên String
        char[] charList = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                if (charList[i] > charList[j]) {
                    char temp = charList[i];
                    charList[i] = charList[j];
                    charList[j] = temp;
                }
            }
        }

        System.out.println(charList);
    }
}

package Bai14_search_algorithm;

import java.sql.Array;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random string");
        String string = scanner.nextLine();

        char[] charList = string.toCharArray();
        String[] result = new String[string.length()];
        String tempString = "";

        for (int i = 0; i < string.length()-1; i++) {
            if(charList[i] < charList[i+1]) {
                if (tempString.equals("")) {
                    tempString = "" + charList[i] + charList[i+1];
                } else {
                    tempString += charList[i+1];
                }
            } else {
                if (!tempString.isEmpty()) {
                    for (int j = 0; j < result.length; j++) {
                        if (result[j] == null) {
                            result[j] = tempString;
                            tempString = "";
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < result.length; j++) {
                        if (result[j] == null) {
                            result[j] = String.valueOf(charList[i]);
                            break;
                        }
                    }
                }

            }
        }
        if (!tempString.isEmpty()) {
            for (int j = 0; j < result.length; j++) {
                if (result[j] == null) {
                    result[j] = tempString;
                    break;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null && result[max] != null && result[i].length() > result[max].length())
                max = i;
        }

        System.out.println("The longest increase string is: " + result[max]);
    }
}

package bai3_array_method;

import java.util.Scanner;

public class Bai8_so_lan_xuat_hien_cua_ky_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random string");
        String randomString = scanner.nextLine();
        System.out.println("Enter a character to find");
        char randomCharacter = scanner.next().charAt(0);
        System.out.println("Character occurrence count is: " + findChracter(randomCharacter, randomString));
    }

    public static int findChracter(char tempCharacter, String tempString){
        int count = 0;
        for (int i = 0; i < tempString.length(); i++) {
            if (tempCharacter == tempString.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}

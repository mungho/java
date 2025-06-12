package Bai12_stack_queue.kiem_tra_palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        Queue<Character> tempQueue = new LinkedList<>();
        Stack<Character> tempStack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            tempQueue.add(string.charAt(i));
            tempStack.add(string.charAt(i));
        }

        boolean check = true;
        for (int i = 0; i < tempQueue.size(); ) {
            if (!tempQueue.poll().equals(tempStack.pop())) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(string + " is a palindrome");
        } else System.out.println(string + " is not a palindrome");
    }
}

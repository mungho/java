package Bai12_stack_queue.thap_phan_sang_nhi_phan;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TransferToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numberStack = new Stack<>();
        System.out.println("Please enter a random number");
        int number = Integer.parseInt(scanner.nextLine());
        int temp;

        while (number != 0) {
            temp = number % 2;
            numberStack.add(temp);
            number /= 2;
        }

        System.out.print("Binary: ");
        while (!numberStack.isEmpty()) {
            System.out.print(numberStack.pop());
        }
    }
}

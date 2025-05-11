import java.util.Scanner;

public class Bai1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount ($): ");
        float amount = Float.parseFloat(scanner.nextLine());
        System.out.println("Vietnamese amount is (VND): " + amount*26000);
    }
}

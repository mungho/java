import java.util.Scanner;

public class Bai2_1 {
    public static void main(String[] args) {
        System.out.println("DANH SÁCH CÁC HÌNH VẼ");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác vuông cân cạnh góc vuông ở dưới");
        System.out.println("3. Hình tam giác vuông cân cạnh góc vuông ở trên");
        System.out.println("---------------------------------------------------");

        System.out.println("Vui lòng nhập số để chọn hình muốn vẽ");
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());

        switch (numb) {
            case (1):
                printRectangle();
                break;
            case (2):
                squareTriangle();
                break;
            case (3):
                isoscelesTriangle();
                break;
            default:
                System.out.println("Vui lòng nhập số hợp lệ");
        }
    }

    public static void printRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều dài hình chữ nhật là: ");
        int lengthRec = Integer.parseInt(scanner.nextLine());
        System.out.println("Chiều rộng hình chữ nhật là: ");
        int widthRec = Integer.parseInt(scanner.nextLine());
        String string = "";

        for (int i = 0; i < widthRec; i++) {
            for (int k = 0; k < lengthRec; k++) {
                string += "*";
            }
            System.out.println(string);
            string = "";
        }
    }

    public static void squareTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cạnh góc vuông là: ");
        int triangleSide = Integer.parseInt(scanner.nextLine());
        String string = "";

        for (int i = 0; i < triangleSide; i++) {
            for (int k = 0; k <= i; k++) {
                string += "*";
            }
            System.out.println(string);
            string = "";
        }
    }

    public static void  isoscelesTriangle () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cạnh góc vuông là: ");
        int triangleSide = Integer.parseInt(scanner.nextLine());
        String string = "";

        for (int i = 0; i < triangleSide; i++) {
            for (int k = 0; k < triangleSide-i; k++) {
                string += "*";
            }
            System.out.println(string);
            string = "";
        }
    }
}

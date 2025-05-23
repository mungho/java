package Bai5_access_modifier.ProductManagement;

import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        ProductFunction productFunction = new ProductFunction();

        while (true) {
            runFunction(productFunction);
//            productFunction.displayProduct();
        }
    }

    public static void runFunction(ProductFunction productFunction) {
        Scanner scanner = new Scanner(System.in);
//        ProductFunction productFunction = new ProductFunction();
        System.out.println(
                "--------------------------------------- \n" +
                "What you want to do? \n" +
                "1. Display product list \n" +
                "2. Add a new product \n" +
                "3. Update product \n" +
                "4. Delete product \n" +
                "----------------------------------------");
        int userAction = Integer.parseInt(scanner.nextLine());
        switch (userAction) {
            case 1: {
                System.out.println("The product list: \n" + productFunction.displayProduct());;
                break;
            }
            case 2: {
                System.out.println("Product's Id:");
                String id = scanner.nextLine();
                System.out.println("Product's Name:");
                String name = scanner.nextLine();
                System.out.println("Product's Price:");
                double price = Double.parseDouble(scanner.nextLine());
                productFunction.createProduct(id, name, price);
                break;
            }
            case 3: {
                System.out.println("Product's Id That You Want To Modify:");
                String id = scanner.nextLine();
                System.out.println("New Product's Name:");
                String name = scanner.nextLine();
                System.out.println("New Product's Price:");
                double price = Double.parseDouble(scanner.nextLine());
                productFunction.updateProduct(id, name, price);
                break;
            }
            case 4: {
                System.out.println("Product's Id That You Want To Delete:");
                String id = scanner.nextLine();
                productFunction.deleteProduct(id);
                break;
            }
        }
    }
}

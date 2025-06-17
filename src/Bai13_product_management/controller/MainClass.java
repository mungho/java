package Bai13_product_management.controller;

import Bai13_product_management.view.ProductView;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        final int DELETE = 4;
        final int FIND = 5;
        final int SORT_INCREASE = 6;
        final int SORT_DESCREASE = 7;
        final int EXIT = 8;
        ProductView productView = new ProductView();
        boolean check = true;


        while (check) {
            System.out.println("------------------------------ \n"+
                    "Programming Structure \n" +
                    "1. Display product list \n" +
                    "2. Add a new product \n" +
                    "3. Edit a product \n" +
                    "4. Delete a product \n" +
                    "5. Search a product by name \n" +
                    "6. Price increase sort \n" +
                    "7. Price descrease sort \n" +
                    "8. Exit program \n" +
                    "------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to start");
            int number = Integer.parseInt(scanner.nextLine());

            switch (number) {
                case DISPLAY:
                    productView.displayProduct();
                    break;
                case ADD:
                    productView.addProduct();
                    break;
                case EDIT:
                    productView.editProduct();
                    break;
                case DELETE:
                    productView.deleteProduct();
                    break;
                case FIND:
                    productView.searchProduct();
                    break;
                case SORT_INCREASE:
                    productView.increaseSort();
                    break;
                case SORT_DESCREASE:
                    productView.decreaseSort();
                    break;
                case EXIT:
                    check = false;
                    break;
                default:
                    System.out.println("Please try again!");
            }
        }
    }
}

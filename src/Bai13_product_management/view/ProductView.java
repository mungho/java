package Bai13_product_management.view;

import Bai13_product_management.controller.ProductController;
import Bai13_product_management.model.entities.Product;
import Bai13_product_management.model.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    ProductController productController = new ProductController();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Product's ID:");
        String productId = scanner.nextLine();
        System.out.println("Product's Name:");
        String productName = scanner.nextLine();
        System.out.println("Product's Price:");
        Integer productPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Product's Storage Number:");
        Integer productStorage = Integer.parseInt(scanner.nextLine());

        if (productId.trim().isEmpty()) {
            while (productId.isEmpty()) {
                System.out.println("Product's ID is empty. Please try again:");
                productId = scanner.nextLine();
            }
        } else if (productName.trim().isEmpty()) {
            while (productName.isEmpty()) {
                System.out.println("Product's Name is empty. Please try again:");
                productName = scanner.nextLine();
            }
        }

        boolean addStatus = productController.addProduct(productId, productName, productPrice, productStorage);

        if (addStatus) {
            System.out.println("Added product successfully!");
        } else {
            System.out.println("Added product failed!");
        }
    }

    public void editProduct() {
        String productId;
        do {
            System.out.println("Product's ID you want to edit:");
            productId = scanner.nextLine();
            if (productId.trim().isEmpty()) {
                System.out.println("Product's ID couldn't empty");
            }
        } while (productId.trim().isEmpty());

        String productName;
        do {
            System.out.println("New Product's Name:");
            productName = scanner.nextLine();
            if (productName.trim().isEmpty()) {
                System.out.println("Product's Name couldn't empty");
            }
        } while (productId.trim().isEmpty());

        Integer productPrice;
        do {
            System.out.println("New Product's Price:");
            productPrice = Integer.parseInt(scanner.nextLine());
            if (productPrice <= 0 || productPrice == null) {
                System.out.println("Product's Price couldn't empty");
            }
        } while (productPrice <= 0 || productPrice == null);

        Integer productStorage;
        do {
            System.out.println("New Product's Storage:");
            productStorage = Integer.parseInt(scanner.nextLine());
            if (productStorage <= 0 || productStorage == null) {
                System.out.println("Product's Storage couldn't empty");
            }
        } while (productStorage <= 0 || productStorage == null);

        boolean result = productController.editProduct(productId, productName, productPrice, productStorage);

        if (result) {
            System.out.println("Edit Product Successfully!");
        } else {
            System.out.println("Edit Product Failed!");
        }
    }

    public void displayProduct() {
        List<Product> productList = productController.productList();
        if (!productList.isEmpty()) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i) != null) {
                    System.out.println("Product " + (i + 1) + ": " + productList.get(i));
                } else {
                    System.out.println("Product list is empty!");
                }
            }
        } else {
            System.out.println("Product list is empty!");
        }
    }

    public void deleteProduct() {
        System.out.println("Enter product ID you want to delete");
        String id = scanner.nextLine();
        boolean result = productController.deleteProduct(id);
        if (result) {
            System.out.println("Delete successfully!");
        } else {
            System.out.println("Delete failed!");
        }
    }

    public void searchProduct() {
        System.out.println("Enter product name");
        String productName = scanner.nextLine();
        List<Product> tempList = productController.searchProduct(productName);
        if(tempList.isEmpty()) {
            System.out.println("There is no product with " + productName);
        } else {
            for (int i = 0; i < tempList.size(); i++) {
                System.out.println(tempList.get(i).toString());
            }
        }
    }

    public void increaseSort() {
        List<Product> sortedList = productController.increaseSort();

        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
    }

    public void decreaseSort() {
        List<Product> sortedList = productController.decreaseSort();

        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
    }
}

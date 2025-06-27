package Bai17_product_management.controller;

import Bai17_product_management.model.entity.Product;
import Bai17_product_management.model.service.ProductService;

public class ProductMain {
    public static void main(String[] args) {
        Bai17_product_management.model.service.ProductService productService = new ProductService();
        Product product = new Product("1", "1", 1F,"a","a");

        productService.addProduct(product);
        System.out.println(productService.displayProduct());
    }
}

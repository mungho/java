package Bai13_product_management.controller;

import Bai13_product_management.model.entities.Product;
import Bai13_product_management.model.service.ProductService;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductService();

    public boolean addProduct(String id, String name, Integer price, Integer storageNumber) {
        return productService.addProduct(id, name, price, storageNumber);
    }

    public boolean editProduct(String id, String name, Integer price, Integer storageNumber) {
        return productService.editProduct(id, name, price, storageNumber);
    }

    public List<Product> productList() {
        return productService.productList();
    }

    public boolean deleteProduct(String id) {
        return productService.deleteProduct(id);
    }

    public List<Product> searchProduct(String name) {
        List<Product> tempList = productService.searchProduct(name);
        return tempList;
    }

    public List<Product> increaseSort() {
        return productService.increaseSort();
    }

    public List<Product> decreaseSort() {
        return productService.decreaseSort();
    }
}

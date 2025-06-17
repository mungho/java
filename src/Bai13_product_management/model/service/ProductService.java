package Bai13_product_management.model.service;

import Bai13_product_management.model.entities.Product;
import Bai13_product_management.model.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    ProductRepository productManagement = new ProductRepository();

    public boolean addProduct(String id, String name, Integer price, Integer storageNumber) {
        if (price <= 0 || storageNumber < 0) {
            return false;
        } else {
            Product tempProduct = new Product(id, name, price, storageNumber);
            return productManagement.addProduct(tempProduct);
        }
    }

    public boolean editProduct(String id, String name, Integer price, Integer storageNumber) {
        int index = productManagement.findProduct(id);
        if (index == -1) {
            return false;
        } else {
            if (price <= 0 || storageNumber < 0) {
                return false;
            } else {
                return productManagement.editProduct(id, name, price, storageNumber, index);
            }
        }
    }

    public List<Product> productList() {
        return productManagement.productList();
    }

    public boolean deleteProduct(String id) {
        return productManagement.deleteProduct(id);
    }

    public List<Product> searchProduct(String name) {
        if (name == null) {
            return new ArrayList<>();
        } else {
            List<Product> tempList = productManagement.searchProduct(name);
            return tempList;
        }
    }

    public List<Product> increaseSort() {
        return productManagement.increaseSort();
    }

    public List<Product> decreaseSort() {
        return productManagement.decreaseSort();
    }
}

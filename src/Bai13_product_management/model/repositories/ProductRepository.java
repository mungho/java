package Bai13_product_management.model.repositories;

import Bai13_product_management.model.entities.Product;
import Bai13_product_management.model.entities.ProductComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductRepository {
    private static List<Product> productList = new  ArrayList<>();
    ProductComparator productComparator = new ProductComparator();

    public boolean addProduct(Product product) {
        productList.add(product);
        return true;
    }

    public boolean editProduct(String id, String name, Integer price, Integer storageNumber, int index) {
        this.productList.get(index).setId(id);
        this.productList.get(index).setName(name);
        this.productList.get(index).setPrice(price);
        this.productList.get(index).setStorageNumber(storageNumber);
        return true;
    }

    public List<Product> productList() {
        return new ArrayList<>(productList);
    }

    public boolean deleteProduct (String id) {
        int productExist = findProduct(id);

        if(productExist == -1) {
            return false;
        } else {
            productList.set(productExist, null);
            return true;
        }
    }

    public List<Product> searchProduct (String name) {
        List<Product> tempList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                tempList.add(productList.get(i));
            }
        }
        return tempList;
    }

    public List<Product> increaseSort() {
        List<Product> increaseList = new ArrayList<>(productList);
        Collections.sort(increaseList, new ProductComparator());
        return increaseList;
    }

    public List<Product> decreaseSort() {
        List<Product> decreaseList = increaseSort();
        Collections.reverse(decreaseList);
        return decreaseList;
    }

    public int findProduct(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}

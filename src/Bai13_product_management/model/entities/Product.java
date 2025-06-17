package Bai13_product_management.model.entities;

import javax.xml.namespace.QName;

public class Product {
    private String name;
    private String id;
    private Integer price;
    private Integer storageNumber;

    public Product() {}

    public Product(String id, String name, Integer price, Integer storageNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storageNumber = storageNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStorageNumber() {
        return storageNumber;
    }

    public void setStorageNumber(Integer storageNumber) {
        this.storageNumber = storageNumber;
    }

    @Override
    public String toString() {
        return "[id: " + this.id +
                "; name: " + this.name +
                "; price: " + this.price +
                "; storage: " + this.storageNumber +
                "]";
    }
}

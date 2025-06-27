package Bai17_product_management.model.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private String productID;
    private String productName;
    private Float productPrice;
    private String productBrand;
    private String productDescription;

    public Product(String productID, String productName, Float productPrice, String productBrand, String productDescription) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBrand = productBrand;
        this.productDescription = productDescription;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "[" + this.productID + ", " +
                this.productName + ", " +
                this.productBrand + ", " +
                this.productPrice + ", " +
                this.productDescription + "]";
    }
}

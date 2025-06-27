package Bai17_product_management.model.service;

import Bai17_product_management.model.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static File productListFile = new File("src/Bai17_product_management/model/entity/file/product_list.dat");

    public void addProduct(Product product) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.productListFile, true))) {
            oos.writeObject(product);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }

    public List<Product> displayProduct() {
        ArrayList<Product> products = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.productListFile))){
            for (Product product : (List<Product>) ois.readObject()) {
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            return products;
        }
    }
}

package Bai13_product_management.model.entities;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}

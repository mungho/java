package Bai5_access_modifier.ProductManagement;

public class ProductFunction {
    Object[] productList = new Object[100];

    public void createProduct(String id, String name, double price) {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] == null) {
                Product newProduct = new Product(id, name, price);
                productList[i] = newProduct;
                break;
            }
        }
    }

    public String displayProduct() {
        String display = "";
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                Product tempObject = (Product) productList[i];
                display += "id: " + tempObject.getId() + ", " +
                        "name: " + tempObject.getName() + ", " +
                        "price: " + tempObject.getPrice() + "\n";
            }
        }
        return display;
    }
    
    public void updateProduct(String id, String name, double price) {
        for (int i = 0; i < productList.length; i++) {
            Product tempProduct = (Product) productList[i];
            if (tempProduct.getId().equals(id)) {
                tempProduct.setName(name);
                tempProduct.setPrice(price);
                break;
            }
        }
    }

    public void deleteProduct(String id) {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                Product tempProduct = (Product) productList[i];
                if (tempProduct.getId().equals(id)) {
                    productList[i] = null;
                    break;
                }
            }
        }
    }
}

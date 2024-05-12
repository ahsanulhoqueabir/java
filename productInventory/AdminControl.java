import java.util.ArrayList;
import java.util.List;

public class AdminControl {
    private List<Product> products;

    public AdminControl() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(String productId, double newPrice, int newQuantity) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                break;
            }
        }
    }

    public void removeProduct(String productId) {
        products.removeIf(product -> product.getProductId() == productId);
    }

    public void displayAllProducts() {

        System.out.println("------------ All Products ---------------");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("-----------------------------------------");
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    public Product searchProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
}

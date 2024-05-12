import java.util.ArrayList;
import java.util.List;

public class UserControl {
    private List<Product> products;

    public UserControl(List<Product> products) {
        this.products = products;
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

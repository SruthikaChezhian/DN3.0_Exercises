import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<Integer, Product> products;

    public InventoryManagementSystem() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.setQuantity(newQuantity);
        }
    }

    public void deleteProduct(int productId) {
        products.remove(productId);
    }
}
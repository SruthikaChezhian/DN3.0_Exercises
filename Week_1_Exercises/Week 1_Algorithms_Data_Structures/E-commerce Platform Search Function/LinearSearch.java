public class LinearSearch {
    public static int search(Product[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(target)) {
                return i;
            }
        }
        return -1; // Not found
    }
}
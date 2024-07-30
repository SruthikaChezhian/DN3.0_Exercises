public class E-commercePlatformSearchFunction {
	Product[] products = new Product[] {
    		new Product(1, "Apple iPhone", "Electronics"),
    		new Product(2, "Samsung TV", "Electronics"),
    		new Product(3, "Sony Headphones", "Electronics"),
	};

	// Linear search
	int index = LinearSearch.search(products, "Samsung TV");

	// Binary search
	Arrays.sort(products, Comparator.comparing(Product::getProductName));
	index = BinarySearch.search(products, "Samsung TV");
}
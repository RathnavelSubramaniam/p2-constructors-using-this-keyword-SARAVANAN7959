class Product {
    // Define instance variables: productId (int), productName (String), price (double)
    int productId;
    String productName;
    double price;

    // Static variable for product count
    static int productCount = 0;

    // Constructor to initialize product attributes
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        productCount++; // Increment product count
    }

    // Calculate and return the discounted price
    public double calculateDiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

    // Display product information
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Static method to retrieve total product count
    public static int getTotalProductCount() {
        return productCount;
    }
}

public class Practical2 {
    public static void main(String[] args) {
        // Create three Product objects with different data
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(202, "Smartphone", 499.95);
        Product product3 = new Product(303, "Tablet", 299.50);

        // Display product information
        System.out.println("Product 1 Information:");
        product1.displayProductInfo();
        System.out.println();

        System.out.println("Product 2 Information:");
        product2.displayProductInfo();
        System.out.println();

        System.out.println("Product 3 Information:");
        product3.displayProductInfo();
        System.out.println();

        // Calculate and display discounted price
        double discountPercentage = 10;
        double discountedPrice = product1.calculateDiscountedPrice(discountPercentage);
        System.out.println("Discounted Price of Product 1 with " + discountPercentage + "% discount: $" + discountedPrice);
        System.out.println();

        // Create a new Product object and calculate and display the discounted price
        Product product4 = new Product(404, "Desktop", 799.99);
        discountedPrice = product4.calculateDiscountedPrice(discountPercentage);
        System.out.println("Discounted Price of Product 4 with " + discountPercentage + "% discount: $" + discountedPrice);
        System.out.println();

        // Display total product count
        System.out.println("Total Product Count: " + Product.getTotalProductCount());
    }
}
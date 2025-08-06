package ku.shop;

public class OutOfStockException extends Exception {
    private String productName;

    public OutOfStockException(String productName) {
        super(productName + " is out of stock");
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}

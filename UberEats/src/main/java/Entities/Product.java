package Entities;

public class Product {

    private int productID;
    private String productName;
    private String productDesc;
    private double productPrice;
    private byte productImage;

    public Product(int productID, String productName, String productDesc, double productPrice, byte productImage) {
        this.productID = productID;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public Product() {
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public byte getProductImage() {
        return productImage;
    }

    public void setProductImage(byte productImage) {
        this.productImage = productImage;
    }
}

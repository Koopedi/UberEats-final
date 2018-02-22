package Entities;

import java.util.Date;

public class Cart {
    private int cartID,quantity,productID;
    private double totalPrice;
    private Date date;
private String userName;

    public Cart() {
    }

    public Cart(int cartID, int quantity, int productID, double totalPrice, Date date, String userName) {
        this.cartID = cartID;
        this.quantity = quantity;
        this.productID = productID;
        this.totalPrice = totalPrice;
        this.date = date;
        this.userName = userName;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCartID() {
        return cartID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getProductID() {
        return productID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public String getUserName() {
        return userName;
    }
}

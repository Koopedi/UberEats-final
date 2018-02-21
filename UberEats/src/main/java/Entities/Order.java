package Entities;

public class Order {

    private  int orderID;
    private double paymentID;
    private String UserName;
    private int deliveryID;

    public Order() {
    }

    public Order(int orderID, double paymentID, String userName, int deliveryID) {
        this.orderID = orderID;
        this.paymentID = paymentID;
        UserName = userName;
        this.deliveryID = deliveryID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setPaymentID(double paymentID) {
        this.paymentID = paymentID;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setDeliveryID(int deliveryID) {
        this.deliveryID = deliveryID;
    }

    public int getOrderID() {
        return orderID;
    }

    public double getPaymentID() {
        return paymentID;
    }

    public String getUserName() {
        return UserName;
    }

    public int getDeliveryID() {
        return deliveryID;
    }
}

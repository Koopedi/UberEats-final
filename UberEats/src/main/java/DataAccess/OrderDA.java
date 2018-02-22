package DataAccess;

import Entities.Order;
import Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
@Repository
public class OrderDA {
    private static Connection sqlConn;
    public   ArrayList<Order> getAllOrders()
    {
        String line = "Select * from order";
        ArrayList<Order> arrOrder= new ArrayList<>();
        try {
            Statement stmt = sqlConn.createStatement();
            ResultSet rsData = stmt.executeQuery(line);
            while(rsData.next())
            {
                arrOrder.add(new Order(rsData.getInt(1),rsData.getDouble(2),rsData.getString(3),rsData.getInt(4)));
            }
        } catch (SQLException e) {
        }
        return arrOrder;
    }

    public  static Order findOrders(int orderID)
    {
        String line = "select * from orders where orderID =" + orderID;
        Order objOrder = null;
        try {
            Statement stmt = sqlConn.createStatement();
            ResultSet rsData = stmt.executeQuery(line);
            if(rsData.next())
            {
                objOrder= new Order(rsData.getInt(1),rsData.getDouble(2),rsData.getString(3),rsData.getInt(4));
            }


        } catch (SQLException e) {
        }
        return objOrder;


    }
    public void deleteOrder(int orderID)
    {
        String line = "delete * from order where orderID =" + orderID ;
        try {
            Statement stmt = sqlConn.createStatement();
            int rsData = stmt.executeUpdate(line);
            if(rsData !=0)
            {
                JOptionPane.showMessageDialog(null,"successfully deleted");
            }

        } catch (SQLException e) {

        }
    }

    public void createOrder(Order objOrder)
    {

      //  int orderID, double paymentID, String userName, int deliveryID
        String line = "insert into Order(orderID,paymentID,userName,deliveryID)Values("+objOrder.getOrderID()+
                "," + objOrder.getPaymentID()+",'"+objOrder.getUserName()+"',"+objOrder.getDeliveryID()+")";
        try {
            Statement stmt = sqlConn.createStatement();
            int rsData = stmt.executeUpdate(line);
            if(rsData!=0)
            {
                JOptionPane.showMessageDialog(null,"Successfully Added");
            }

        } catch (SQLException e) {

        }
    }
}

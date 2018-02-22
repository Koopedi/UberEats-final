package DataAccess;

import Entities.Cart;
import Entities.Order;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class CartDA {

    private static Connection sqlConn;

    public void createCart(Cart objCart)
    {

        //int cartID, int quantity, int productID, double totalPrice, Date date, String userName
        String line = "insert into carts(cartID,quantity,productID,totalPrice,date,userName)Values("+objCart.getCartID()+
                "," + objCart.getQuantity()+",'"+objCart.getProductID()+"',"+objCart.getTotalPrice()+","
                + objCart.getTotalPrice()+",'"+objCart.getUserName()+"')";
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

    public void deleteItem(int productID)
    {
        String line = "delete * from carts where productID =" + productID ;
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



}

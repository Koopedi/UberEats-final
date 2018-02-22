package DataAccess;


import Entities.Product;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

@Repository
public class ProductDA {
   private static Connection sqlConn;
    public ArrayList<Product> getAllProducts()
    {
   String query = "select * from products";
   ArrayList<Product> arrProducts = new ArrayList<>();
   try {
       Statement stmt = sqlConn.createStatement();
       ResultSet rsData = stmt.executeQuery(query);
       while(rsData.next())
       {
           arrProducts.add(new Product(rsData.getInt(1),rsData.getString(2),rsData.getString(3),rsData.getDouble(4),rsData.getByte(5)));
       }
   } catch (SQLException e) {
       e.printStackTrace();
   }
   return arrProducts;
    }

    public  static Product findProduct(int productID)
    {
        String line = "select * from products where productID =" + productID;
        Product objProd = null;
        try {
            Statement stmt = sqlConn.createStatement();
            ResultSet rsData = stmt.executeQuery(line);
            if(rsData.next()) {
                objProd = new Product(rsData.getInt(1), rsData.getString(2), rsData.getString(3), rsData.getDouble(4), rsData.getByte(5));
            }

        } catch (SQLException e) {

        }
        return objProd;
    }
    public void deleteProduct(int productID)
    {


        String line = "delete from products where productID =" + productID;
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

    public void addProduct(Product objProduct)
    {
        String line = "insert into products(productID,productName,productDesc,productPrice" +
                ",productImage)Values("+ objProduct.getProductID()+
                ",'" + objProduct.getProductName()+"','"+objProduct.getProductDesc()+"',"
                +objProduct.getProductPrice()+","+objProduct.getProductImage()+")";
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
    public void updateProduct(Product objProduct)
    {

      //  int productID; String productName; String productDesc; double productPrice; byte productImage;


        String line ="update products set  productPrice ='"+ objProduct.getProductPrice() + "'where productID ="+objProduct.getProductID();
        try {
            Statement stmt = sqlConn.createStatement();
            int rsData = stmt.executeUpdate(line);
            if(rsData!=0)
            {
                JOptionPane.showMessageDialog(null,"SuccessFully Updated");
            }
        } catch (SQLException e) {

        }

    }
}

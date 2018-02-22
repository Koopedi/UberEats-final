package DataAccess;

import Entities.User;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
@Repository
public class UserDA {
    private static Connection sqlConn;

    public  void AddNewUser(User objUser)
    {
        String line = "insert into users(firstName,password,lastName,emailAddress,phoneNumber,userType)Values" +
                "('"+ objUser.getFirstName()+"','"+objUser.getPassword()+"','"+objUser.getLastName()+"','"+objUser.getEmailAddress()+"','"+objUser.getPhoneNumber()+"','"+objUser.getUserType()+"')";

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
    public void updateUser(User objUser)
    {
        String line ="update users set  password ='"+ objUser.getPassword() + "'where emailAddress ="+objUser.getEmailAddress();
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

    public void deleteUser(String userName)
    {
        String line = "delete from users where emailAddress =" + userName;
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
  /*  public  boolean Login(String userName,String password)
    {

    }*/

}

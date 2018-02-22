package Views;

import DataAccess.UserDA;
import Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserView {
    @Autowired
   private UserDA userDA;
 public  void AddNewUser(User objUser)
 {

 }
 public void updateUser(User objUser)
 {

 }

 public void deleteUser(String userName)
 {

 }
 public  boolean Login(String userName,String password)
 {

 }
}

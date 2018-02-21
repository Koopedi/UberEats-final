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
    public  void AddNewUser(User objUse)
    {

    }
    public void updateUser(User objUser)
    {

    }

    public void deleteUser(String userName)
    {

    }
    public  ArrayList<User> getAllUsers()
    {
//return this.userDA.g
    }
    public   User findUser(String userName)
    {

    }
}

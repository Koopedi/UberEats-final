package DataAccess;

import Entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
@Repository
public class OrderDA {
    @Autowired
    public   ArrayList<Order> getAllOrders()
    {

    }

    public  static Order findOrders(int orderID)
    {

    }
    public void deleteOrder(int orderID)
    {

    }

    public void createOrder(int orderID)
    {

    }
}

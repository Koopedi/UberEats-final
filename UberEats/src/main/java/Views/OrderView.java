package Views;

import DataAccess.OrderDA;
import Entities.Order;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

    @Service
    public class OrderView {
    @Autowired
    private static OrderDA orderDA;
    public   ArrayList<Order> getAllOrders()
    {
    return this.orderDA.getAllOrders();
    }

    public   Order findOrders(int orderID)
    {
    return  this.orderDA.findOrders(orderID);
    }
    public void deleteOrder(int orderID)
    {

    }

    public void createOrder(int orderID)
    {

    }

}

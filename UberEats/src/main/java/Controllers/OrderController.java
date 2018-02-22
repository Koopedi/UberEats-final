package Controllers;

import Entities.Order;
import Views.OrderView;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class OrderController {
@Autowired
private OrderView orderView;
    public   ArrayList<Order> getAllOrders()
    {

    }

    public  static Order findOrders(int orderID)
    {

    }
    public void deleteOrder(int orderID)
    {

    }

    public void createOrder(Order objOredr)
    {

    }
}

package Views;

import DataAccess.OrderDA;
import Entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

    @Service
    public class OrderView {
    @Autowired
    private static OrderDA orderDA;


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

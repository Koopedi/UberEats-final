package Views;


import DataAccess.ProductDA;
import Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductView {
    @Autowired
    private ProductDA productDA;


    public ArrayList<Product> getAllProducts()
    {

    }

    public  static Product findProduct(int productID)
    {
    }
    public void deleteProduct(int productID)
    {

    }

    public void addProduct(Product objProduct)
    {

    }
    public void updateProduct(Product objProduct)
    {

    }
}

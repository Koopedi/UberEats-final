package Controllers;


import Entities.Product;
import Views.ProductView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {

    @Autowired
    private ProductView productView;


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

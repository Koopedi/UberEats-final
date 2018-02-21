package Views;


import DataAccess.ProductDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductView {
    @Autowired
    private ProductDA productDA;
}

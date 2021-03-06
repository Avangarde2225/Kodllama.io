package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.jLoggerManager;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao; // dependency injection using the productDao instance and accessing it via the constructor
    private LoggerService loggerService;


    public ProductManager(ProductDao productDao, LoggerService loggerService) {

        this.productDao = productDao;
        this.loggerService = loggerService;
    }



    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Not accepted");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Product has been added " + product.getName());



    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}

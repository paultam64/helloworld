package com.ptam.ejb;

import com.ptam.model.Product;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@javax.ejb.Stateless(name = "OrderBusinessSessionEJB")
public class OrderBusinessSessionEJBBean implements OrderBusiness {

    private static final Logger Logger = LoggerFactory.getLogger(OrderBusinessSessionEJBBean.class);

    private List<Product>  productList = new ArrayList();

    public OrderBusinessSessionEJBBean() {
        init();
    }

    private void init() {
        Logger.info("Enter init");
        for ( int i = 0; i < 4; i++  ) {
            Product product = new Product();
            product.setId(i);
            product.setName("product "+i);
            product.setInventory(100 * i);
            product.setManufacturer("manufacturer "+i);
            productList.add(product);
        }
    }

    public List<String> getProducts() {
        List<String>  retList = new ArrayList();
        for ( int i = 0; i < productList.size(); i++ )
             retList.add(productList.get(i).getName());
        return retList;
    }

    public Integer inventoryOfProduct(Integer productId) {
        if ( productList.get(productId) == null )
            return -1;
        else
            return productList.get(productId).getInventory();
    }

    public void addProductToCart(Product product) throws Exception {
        if ( productList.get(product.getId()) == null )
            productList.add(product);
        else {
            Logger.error("Product " + product.getId() + " already exist in product list");
            throw new Exception("Product " + product.getId() + " already exist in product list");
        }

    }

    public void shipOrder(Integer orderId) throws Exception {

    }

    @Override
    public Long getCurrentTimeStamp() {
        Instant nowInst = Instant.now();
        return nowInst.toEpochMilli();
    }
}

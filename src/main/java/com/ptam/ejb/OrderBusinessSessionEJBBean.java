package com.ptam.ejb;

import java.util.List;

@javax.ejb.Stateless(name = "OrderBusinessSessionEJBEJB")
public class OrderBusinessSessionEJBBean implements OrderBusiness {


    public OrderBusinessSessionEJBBean() {
    }

    public List<String> getProducts() {
        return null;
    }

    public Integer inventoryOfProduct(Integer productId) {
        return null;
    }

    public void addProductToCart(Integer productId) throws Exception {

    }

    public void shipOrder(Integer orderId) throws Exception {

    }
}

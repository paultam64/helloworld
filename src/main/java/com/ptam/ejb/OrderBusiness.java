package com.ptam.ejb;

import java.util.List;

public interface OrderBusiness {

    public List<String> getProducts();

    public Integer inventoryOfProduct(Integer productId);

    public void addProductToCart(Integer productId) throws Exception;

    public void shipOrder(Integer orderId) throws Exception;
}

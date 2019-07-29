package com.ptam.ejb;

import com.ptam.model.Product;

import java.util.List;

public interface OrderBusiness {

    List<String> getProducts();

    Integer inventoryOfProduct(Integer productId);

    void addProductToCart(Product product) throws Exception;

    void shipOrder(Integer orderId) throws Exception;
}

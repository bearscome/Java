package com.hellowShop.order;

import com.hellowShop.product.Product;
import com.hellowShop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product =new Product();
        Order order = new Order(user, product);
    }
}

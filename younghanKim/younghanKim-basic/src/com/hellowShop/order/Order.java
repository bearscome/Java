package com.hellowShop.order;

import com.hellowShop.product.Product;
import com.hellowShop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}

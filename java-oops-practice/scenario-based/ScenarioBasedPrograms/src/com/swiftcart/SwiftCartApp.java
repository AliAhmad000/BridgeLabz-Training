package com.swiftcart;

public class SwiftCartApp {
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50);
        Product sweet = new PerishableProduct("Sweet", 320);
        Product rice = new NonPerishableProduct("Rice", 100);
        Product wheat = new NonPerishableProduct("Wheat", 50);

        Cart cart = new Cart();
        cart.addProduct(milk, 2);
        cart.addProduct(sweet, 1);
        cart.addProduct(wheat, 2);
        cart.addProduct(rice, 1);

        cart.applyDiscount(20); // coupon
        cart.generateBill();
    }
}


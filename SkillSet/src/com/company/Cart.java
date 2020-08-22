package com.company;

public class Cart {

    public Cart() {
        System.out.println("Default Constructor Called");
    }

    public Cart(int cartItem) {
        this.cartItem = cartItem;
        System.out.println("Constructor with parameter 1 is called : " + cartItem);
    }

    private int cartItem;
}

package com.reginapeyfuss.creational.factory;

public class Shop extends Website {
    public void createWebsite(){
        pages.add(new CartPage());
        pages.add(new SearchPage());
        pages.add(new ItemPage());
    }
}

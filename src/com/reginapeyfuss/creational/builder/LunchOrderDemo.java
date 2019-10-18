package com.reginapeyfuss.creational.builder;

import com.reginapeyfuss.creational.builder.LunchOrder;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("white").dressing("french").meat("chicken");
        LunchOrder lunchOrder = builder.build();
    }
}

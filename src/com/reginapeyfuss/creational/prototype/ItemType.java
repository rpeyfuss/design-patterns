package com.reginapeyfuss.creational.prototype;

public enum ItemType {
    MOVIE("Movie"), BOOK("Book");
    private String itemType;

    private ItemType(String itemType){
        this.itemType = itemType;
    }
    public String getItemType(){
        return this.itemType;
    }
}

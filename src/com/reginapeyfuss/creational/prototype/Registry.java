package com.reginapeyfuss.creational.prototype;

import com.reginapeyfuss.creational.prototype.Book;
import com.reginapeyfuss.creational.prototype.Item;
import com.reginapeyfuss.creational.prototype.Movie;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("testing star wars");
        movie.setPrice(25.99);
        movie.setRuntime("2.5 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Faust");
        book.setPrice(49.99);
        book.setNumberOfPages(551);
        items.put("Book", book);
    }
}

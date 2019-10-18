package com.reginapeyfuss.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie)registry.createItem(ItemType.MOVIE.getItemType());
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie)registry.createItem(ItemType.MOVIE.getItemType());
        anotherMovie.setTitle("Gang of Four");
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

    }
}

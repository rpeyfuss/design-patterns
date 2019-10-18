package com.reginapeyfuss.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
	// write your code here
        printRuntime();
    }
    static public void printRuntime () {
        Runtime singletonInstance = Runtime.getRuntime();
        singletonInstance.gc();
        System.out.println(singletonInstance);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);
        if (singletonInstance == anotherInstance)
            System.out.println("both instances are them same");
        else
            System.out.println("both instances are not the same");
    }
}

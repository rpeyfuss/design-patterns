package com.reginapeyfuss.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    //volatile is used to make is threadsafe
    //null is used to it is lazily loaded, will increase performance
    private static volatile DbSingleton instance = null;
    private static volatile Connection conn = null;
    private DbSingleton() {

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //check for reflection
        if (conn != null) {
            throw new RuntimeException("Use getConnection method to create");
        }
        //this will make sure that only one instance is created and prevent
        //reflection to be able to create an instance
        if (instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            //synchronized is used on the null check instead of the method
            //this double check will prevent two threads to create two instances
            //synchronized is blocking/locking
            synchronized(DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            synchronized(DbSingleton.class){
                if (conn == null){
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}

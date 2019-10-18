package com.reginapeyfuss.creational.singleton;

import com.reginapeyfuss.creational.singleton.DbSingleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main(String[] args) {
        // write your code here
        DbSingleton instance = DbSingleton.getInstance();
        long timeBefore = 0;
        long timeAfter = 0;

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement sta;
        try {
            sta = conn.createStatement();
            int count = sta
                    .executeUpdate("CREATE TABLE Addresss(ID INT, StreetName VARCHAR(20)," +
                   " City VARCHAR(20))");
            sta.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

    }
}

package com.example.forjwebapp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCTest {


    @Test
    @DisplayName("JDBC 연결 테스트")
    public void testConnection(){
        System.out.println("Connection ....");
        try(Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://112.153.247.72:3306/forj?serverTimezone=UTC&characterEncoding=UTF8",
                            "root",
                            "root"
                    )){
            System.out.println(con);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

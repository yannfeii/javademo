package com.sun.jdbc;

import java.sql.*;

public class StatementDemo {

    static final String DBURL = "jdbc:mysql://litemall.hogwarts.ceshiren.com:13306/litemall?useSSL=false";
    static final String USER = "test";
    static final String PASSWORD = "test123456";

    public static void main(String[] args){

        Connection connection = null;
        String query = "select * from litemall_cart where user_id=1 and deleted=0";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DBURL,USER,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println("ID "+resultSet.getInt("id"));
                System.out.println("Goods Name "+resultSet.getInt("goods_name"));
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to SQL " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the connection " + e);
            }
        }

    }
}

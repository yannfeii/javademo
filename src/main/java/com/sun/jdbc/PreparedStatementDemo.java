package com.sun.jdbc;

import java.sql.*;

public class PreparedStatementDemo {

    static final String DBURL = "jdbc:mysql://litemall.hogwarts.ceshiren.com:13306/litemall?useSSL=false";
    static final String USER = "test";
    static final String PASSWORD = "test123456";

    public static void main(String[] args){

        Connection connection = null;
        String preQuery = "select * from litemall_cart where user_id=? and deleted=0";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DBURL,USER,PASSWORD);

            PreparedStatement prepareStatement = connection.prepareStatement(preQuery,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            //第一个代表参数的位置，第二个代表要赋的值
            prepareStatement.setInt(1,1);
            //prepareStatement.setString(2,1);
            ResultSet preResultSet = prepareStatement.executeQuery();

            //获取第一行
            preResultSet.first();
            //获取最后一行
            preResultSet.last();
            preResultSet.getInt(1);
            preResultSet.getString("id");

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

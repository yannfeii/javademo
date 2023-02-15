package com.sun.jdbc;

import java.sql.*;

public class CallableStatementDemo {

    static final String DBURL = "jdbc:mysql://litemall.hogwarts.ceshiren.com:13306/litemall?useSSL=false";
    static final String USER = "test";
    static final String PASSWORD = "test123456";

    public static void main(String[] args){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DBURL,USER,PASSWORD);
            System.out.println("Connected!");
            String callProcedure = "{ call GET_MOVIE_DETAILS1}";
            CallableStatement callableStatement = connection.prepareCall(callProcedure);
            System.out.println("Callable Statement created");
            ResultSet resultSet = callableStatement.executeQuery();

            String callProcedure2 = "{ call GET_MOVIE_DETAILS4 (?,?)}";
            CallableStatement callableStatement2 = connection.prepareCall(callProcedure2);
            System.out.println("Callable Statement2 created");

            while(resultSet.next()){
                System.out.println("Movie details : " + resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e);
        } catch (SQLException e) {
            System.out.println("SQLException " + e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Unable to close the connection " + e);
            }
        }

    }
}

//    CREATE PROCEDURE GET_MOVIE_DETAILS4(LANGUAGE_IN CHAR(50), CATEGORY_NAME_IN CHAR(50))
//    BEGIN
//        SELECT FILM.TITLE, LANGUAGE.NAME AS 'LANGUAGE', CATEGORY.NAME AS 'CATEGORY'
//        FROM FILM
//        JOIN LANGUAGE ON FILM.LANGUAGE_ID = LANGUAGE.language_id
//        JOIN FILM_CATEGORY ON FILM.FILM_ID = FILM_CATEGORY.FILM_ID
//        JOIN CATEGORY ON CATEGORY.category_id = film_category.category_id
//        where (FILM.TITLE LIKE LANGUAGE_IN AND
//        CATEGORY.NAME LIKE CATEGORY_NAME_IN) or (FILM.TITLE = '' AND CATEGORY.NAME LIKE CATEGORY_NAME_IN);
//     END;

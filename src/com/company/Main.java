package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "armansh"
                , "arman4563");
        PreparedStatement preparedStatement =
                connection.prepareStatement("insert into student (code,username,email,password,age,education) values (?,?,?,?,?,?)");
        preparedStatement.setLong(1,2523);
        preparedStatement.setString(2,"nimamo");
        preparedStatement.setString(3,"Nimaamiri@gmail.com");
        preparedStatement.setString(4,"6675");
        preparedStatement.setLong(5,20);
        preparedStatement.setString(6,"diplom");
       preparedStatement.executeUpdate();
        preparedStatement.setLong(1,353);
        preparedStatement.setString(2,"armandiz");
        preparedStatement.setString(3,"armanshz@yahoo.com");
        preparedStatement.setString(4,"3520");
        preparedStatement.setLong(5,19);
        preparedStatement.setString(6,"lisans");
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}

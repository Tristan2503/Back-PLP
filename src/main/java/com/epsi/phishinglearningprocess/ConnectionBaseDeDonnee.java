package com.epsi.phishinglearningprocess;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionBaseDeDonnee {


    Properties appProps = new Properties();

    private Connection connection;

    public ConnectionBaseDeDonnee()
    {
        try {
            appProps.load(new FileInputStream("src/main/resources/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String URL = appProps.getProperty("spring.datasource.url");
        String username = appProps.getProperty("spring.datasource.username");
        String password = appProps.getProperty("spring.datasource.password");
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
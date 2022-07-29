/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fmunoz
 */
public class DBData {

    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3308/petsClinic";
    Connection con;

    public DBData() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.print("Database is connected !");
        } catch (SQLException e) {
            System.out.print("no Conectado");
        }
    }

    public Connection getConnection() {
        return con;
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

}

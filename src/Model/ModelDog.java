/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import paquete2.*;

/**
 *
 * @author fmunoz
 */
public class ModelDog {

    DBData dbData;

    public ModelDog() {
        this.dbData = new DBData();

    }

    public boolean CreatePet(Dog perro) {
        try ( Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            System.out.println("Que gonorre");
            String query = "INSERT INTO Pet (code, name, born_year, color, health_status) VALUES (?,?,?,?,?)";
            PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementPet.setString(1, perro.getCode());
            statementPet.setString(2, perro.getName());
            statementPet.setInt(3, perro.getBorn_year());
            statementPet.setString(4, perro.getColor());
            statementPet.setString(5, perro.getHealthStatus());
            int rowsInserted = statementPet.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet generatedKeys = statementPet.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int petId = generatedKeys.getInt(1);
                    query= "INSERT INTO Dog (breed,pedigree, petId) VALUES (?, ?, ?)";
                    PreparedStatement  statementDog=  conn.prepareStatement(query);
                    statementDog.setString(1, perro.getBreed());
                    statementDog.setBoolean(2, perro.isPedigree());
                    statementDog.setInt(3, petId);
                    rowsInserted = statementDog.executeUpdate();
                    if(rowsInserted > 0){
                        return true ;
                    }
                }
            }
            return false;
        } catch (SQLException e) {
            return false;
        }

    }

    public boolean EditPet(Dog perro) {
        try {

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean DeletePet(Dog perro) {
        try {

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Pet SearchPet(String code) {
        Dog dog = null;
        try {

            return dog;
        } catch (Exception e) {
            return dog;
        }
    }

}

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
                    query = "INSERT INTO Dog (breed, pedigree, petId) VALUES (?, ?, ?)";
                    PreparedStatement statementDog = conn.prepareStatement(query);
                    statementDog.setString(1, perro.getBreed());
                    statementDog.setBoolean(2, perro.isPedigree());
                    statementDog.setInt(3, petId);
                    rowsInserted = statementDog.executeUpdate();
                    if (rowsInserted > 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (SQLException e) {
            System.out.print(e);

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
        try ( Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "SELECT * FROM Pet AS P INNER JOIN  Dog AS d  on p.id = d.petId WHERE p.code = ? ";
            PreparedStatement statementPet = conn.prepareStatement(query);
            statementPet.setString(1, code);
            ResultSet result = statementPet.executeQuery();
            while (result.next()) {
                int petId = result.getInt(1);
                String petCode = result.getString(2);
                String petName = result.getString(3);
                int petBornYear = result.getInt(4);
                String petColor = result.getString(5);
                String petHealthStatus = result.getString(6);
                int dogId = result.getInt(7);
                String petBreed = result.getString(8);
                Boolean petPedigree = result.getBoolean(9);
                dog = new Dog(dogId, petBreed, petPedigree, petId, petCode, petName, petBornYear, petColor, petHealthStatus);

            }

            return dog;
        } catch (Exception e) {
            return dog;
        }
    }

}

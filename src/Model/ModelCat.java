/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import java.util.LinkedList;
import paquete2.Cat;
import paquete2.Dog;
import paquete2.Pet;

/**
 *
 * @author fmunoz
 */
public class ModelCat {

    DBData dbData;

    public ModelCat() {
        this.dbData = new DBData();
    }

    public boolean CreatePet(Cat gato) {
        try ( Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO Pet (code, name, born_year, color, health_status) VALUES (?,?,?,?,?)";

            PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementPet.setString(1, gato.getCode());
            statementPet.setString(2, gato.getName());
            statementPet.setInt(3, gato.getBorn_year());
            statementPet.setString(4, gato.getColor());
            statementPet.setString(5, gato.getHealthStatus());
            System.out.println(gato.getPetId());
            System.out.println(gato.getCatId());

            int rowsInserted = statementPet.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Entro aqui");
                ResultSet generatedKeys = statementPet.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int petId = generatedKeys.getInt(1);
                    System.out.println(petId);
                    query = "INSERT INTO Cat (breed, petId) VALUES (?, ?)";
                    PreparedStatement statementCat = conn.prepareStatement(query);
                    statementCat.setString(1, gato.getBreed());
                    statementCat.setInt(2, petId);
                    rowsInserted = statementCat.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("Hola ");
                        return true;
                    }
                }
            }
            System.out.println("gonorrea hpta");
            return false;
        } catch (SQLException e) {
            System.out.print(e);

            return false;
        }

    }

    public boolean EditPet(Cat gato) {

       try ( Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryPet = " UPDATE Pet SET code = ?, name = ? , born_year = ?, color = ? , health_status = ? WHERE id = ?";
            PreparedStatement statementPet = conn.prepareStatement(queryPet);
            statementPet.setString(1, gato.getCode());
            statementPet.setString(2, gato.getName());
            statementPet.setInt(3, gato.getBorn_year());
            statementPet.setString(4, gato.getColor());
            statementPet.setString(5, gato.getHealthStatus());
            statementPet.setInt(6, gato.getPetId());

            String queryDog = " UPDATE Cat SET breed = ? WHERE id = ?";
            PreparedStatement statemetCat = conn.prepareStatement(queryDog);
            statemetCat.setString(1, gato.getBreed());
            statemetCat.setInt(2, gato.getCatId());
            int rowsUpdatedPet = statementPet.executeUpdate();
            int rowsUpdateCat = statemetCat.executeUpdate();
            return rowsUpdatedPet > 0 && rowsUpdateCat > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean DeletePet(Cat gato) {
        try {

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Pet SearchPet(String code) {
        Cat gato = null;
        try ( Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "select * from Pet as p INNER JOIN Cat as d on p.id = d.petId where p.code = ?";
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
                int catId = result.getInt(7);
                String petBreed = result.getString(8);
                gato = new Cat(catId, petBreed, petId, petCode, petName, petBornYear, petColor, petHealthStatus);

            }

            return gato;
        } catch (Exception e) {
            return gato;
        }

    }

    public LinkedList<Pet> listPet() {
        LinkedList<Pet> catList = new LinkedList<>();

        try ( Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "SELECT * FROM Pet as p INNER join Cat as d on p.id = d.petId";
            PreparedStatement statementPet = conn.prepareStatement(query);
            ResultSet result = statementPet.executeQuery();
            while (result.next()) {
                int petId = result.getInt(1);
                String petCode = result.getString(2);
                String petName = result.getString(3);
                int petBornYear = result.getInt(4);
                String petColor = result.getString(5);
                String petHealthStatus = result.getString(6);
                int catId = result.getInt(7);
                String petBreed = result.getString(8);
                Cat cat = new Cat(catId, petBreed, petId, petCode, petName, petBornYear, petColor, petHealthStatus);
                catList.add(cat);

            }

            return catList;
        } catch (Exception e) {
            return catList;
        }
    }
}

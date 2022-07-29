/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import interfaces.*;

/** 
 *
 * @author fmunoz
 */
public class Pet implements IAnimal, IVertebrate{
    private String code;
    private String name;
    private int born_year;
    private String Color;
    private String healthStatus;
    private Veterinary veterinary;
    
    public void Eat(){
        System.out.println("La mascota come");
        
    }
    
    public void Move(){
        System.out.println("La mascota camina");
    }
    
    public void Sound(){
        System.out.println("La mascota hace sonidos");
        
    }

    public Pet(String code, String name, int born_year, String Color, String healthStatus) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.Color = Color;
        this.healthStatus = healthStatus;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the healthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * @param healthStatus the healthStatus to set
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * @return the veterinary
     */
    public Veterinary getVeterinary() {
        return veterinary;
    }

    /**
     * @param veterinary the veterinary to set
     */
    public void setVeterinary(Veterinary veterinary) {
        this.veterinary = veterinary;
    }

    @Override
    public String getAnimalType() {
        return "Domestico";
    }

    @Override
    public int getNumberOfBones() {
        return 0;
    }
    
    

    
    
    
    
    
    
}

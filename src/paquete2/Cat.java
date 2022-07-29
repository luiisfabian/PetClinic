/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class Cat extends Pet {

    private String breed;

    public void SelfCleaning() {
        System.out.println("El gato se baña solo");
    }

    public void mostrarDatosGato() {
        System.out.println("el codigo del perro es " + getCode() + "  el nombre es " + getName() + " año de nacimiento es " + getBorn_year() + " color es " + getColor() + " \n");
        System.out.println("su estado de salud es " + getHealthStatus() + " la raza es " + getBreed());
    }

    public Cat(String breed, String code, String name, int born_year, String Color, String healthStatus) {
        super(code, name, born_year, Color, healthStatus);
        this.breed = breed;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

   
    @Override    
    public void Sound(){
        System.out.println(" el gato " + super.getName() + " Hace Meauuuuuu");
    }
    
    @Override
    public int getNumberOfBones(){
        return 230;
    }
    
    @Override
    public String getAnimalType(){
        return "Gato";
    }
    
    
}

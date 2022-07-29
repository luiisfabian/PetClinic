/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class Dog extends Pet {

    private String breed;
    private boolean pedigree;

    public void WalkAround() {
        System.out.println("El perro camina solo");
    }
    
    public void WalkAround(int km){
        System.out.println("El perro " + super.getName() + " esta corriento " + km + " km" );
    }
    
    public void WalkAround(boolean dogLeash){
        String hasLeash = dogLeash ? "Con correa" : "Sin Correa";
        
        System.out.println("El perro " + super.getName() + " esta  " + hasLeash );
    }

    public void mostrarDatosPerro() {
        System.out.println("el codigo del perro es " + getCode() + " el nombre es " + getName() + " año de nacimiento es " + getBorn_year() + " color es " + getColor() + "\n");
        System.out.println("su estado de salud es " + getHealthStatus() + " la raza es " + getBreed() + " y come pedigree? " + isPedigree());
    }

    public Dog(String breed, boolean pedigree, String code, String name, int born_year, String Color, String healthStatus) {
        super(code, name, born_year, Color, healthStatus);
        this.breed = breed;
        this.pedigree = pedigree;
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

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
       
    @Override    
    public void Sound(){
        System.out.println(" el perro " + super.getName() + " Hace Guau");
    }
    
    
    @Override
    public int getNumberOfBones(){
        return 300;
    }
    
    @Override
    public String getAnimalType(){
        return "Perro";
    }
    

    
    
    
}

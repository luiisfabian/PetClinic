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
    private int dogId;
    private String breed;
    private boolean pedigree;

    public Dog(int dogId, String breed, boolean pedigree, int petId, String code, String name, int born_year, String Color, String healthStatus) {
        super(petId, code, name, born_year, Color, healthStatus);
        this.dogId = dogId;
        this.breed = breed;
        this.pedigree = pedigree;
    }

    
    

    public void WalkAround() {
        System.out.println("El perro camina solo");
    }

    public void WalkAround(int km) {
        System.out.println("El perro " + super.getName() + " esta corriento " + km + " km");
    }

    public void WalkAround(boolean dogLeash) {
        String hasLeash = dogLeash ? "Con correa" : "Sin Correa";

        System.out.println("El perro " + super.getName() + " esta  " + hasLeash);
    }

    @Override
    public void Sound() {
        System.out.println(" el perro " + super.getName() + " Hace Guau");
    }

    @Override
    public int getNumberOfBones() {
        return 300;
    }

    @Override
    public String getAnimalType() {
        return "Perro";
    }

    /**
     * @return the dogId
     */
    public int getDogId() {
        return dogId;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param dogId the dogId to set
     */
    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }



}

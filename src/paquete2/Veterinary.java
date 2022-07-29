/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class Veterinary extends AbsHospital{

    private String nameVeterinary;
    private String tel;
    private String address;
    private Doctor doctor;
    
    
    public String petCare(Pet pet){
        System.out.println("Atendiendo a la mascota"+ pet.getName());
        return pet.getHealthStatus();
    }
    
    public Veterinary(String nameVeterinary, String tel, String address, Doctor doctor) {
        this.nameVeterinary = nameVeterinary;
        this.tel = tel;
        this.address = address;
        this.doctor = doctor;
    }

    /**
     * @return the nameVeterinary
     */
    public String getNameVeterinary() {
        return nameVeterinary;
    }

    /**
     * @param nameVeterinary the nameVeterinary to set
     */
    public void setNameVeterinary(String nameVeterinary) {
        this.nameVeterinary = nameVeterinary;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String getPaternType() {
        return "Animal";
    }

    @Override
    public String sugery() {
        return "Surgery Animal Data"; 
    }
    
    
    
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author fmunoz
 */
public class Doctor  {

    private String name;
    private String licence;

    

    public void MostrarDatosDoctor() {
        System.out.println("el nombre del vaterinario es " + getName() + " la licencia es " + getLicence());
    }

    public Doctor(String name, String licence) {
        this.name = name;
        this.licence = licence;
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
     * @return the licence
     */
    public String getLicence() {
        return licence;
    }

    /**
     * @param licence the licence to set
     */
    public void setLicence(String licence) {
        this.licence = licence;
    }
    
    
    
    
    
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.Doctor;
import paquete2.Veterinary;

/**
 *
 * @author fmunoz
 */
public class AbstractClass {

    public static void main(String[] args) {
        Doctor doct = new Doctor("Elkin", "23233232");
        Veterinary veterinaria = new Veterinary("Huellas de amor", "2323232", "Cr 123 # 34 - 34", doct);

        veterinaria.setData(veterinaria.getNameVeterinary() + " - " + veterinaria.getAddress());

        String data = veterinaria.getHospitalInformation();
        String type = veterinaria.getPaternType();
        String sugery = veterinaria.sugery();

        System.out.println("data " + data);
        System.out.println("type " + type);
        System.out.println("sugery " + sugery);
    }
}

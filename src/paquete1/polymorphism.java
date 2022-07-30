/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.*;

/**
 *
 * @author fmunoz
 */
public class polymorphism {
    public static void main(String[] args) {
        Dog perro = new Dog(0, "Pitbull", true, 123, "1", "cratus", 1, "cafe", "saludable");
        Cat gato = new Cat("Criollo", 123, "123", "margin", 1, "Verde", "saludable");

        
        Doctor doct = new Doctor("Elkin", "23233232");
        Veterinary veterinaria = new Veterinary("Huellas de amor", "2323232", "Cr 123 # 34 - 34", doct);
        
        String careDog = veterinaria.petCare(perro);
        
        System.out.println("el estado de salud de  " + perro.getName() +  "es : "+careDog  );
        
         String careCat = veterinaria.petCare(gato);
        
        System.out.println("el estado de salud de  " + gato.getName() +  "es : "+ careCat  );
  
    }
}

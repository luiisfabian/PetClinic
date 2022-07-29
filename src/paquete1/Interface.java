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
public class Interface {
    public static void main(String[] args) {
         Dog perro = new Dog("Pitbull", true, "123", "Cratus", 1, "cafe", "Saludable");
        Cat gato = new Cat("Criollo", "1232", "Martin", 2, "Blanco", "Saludable");
        
        System.out.println(perro.getAnimalType());
        System.out.println("" + gato.getAnimalType());
        
        
        System.out.println(perro.getNumberOfBones());
        System.out.println("" + gato.getNumberOfBones());
    }
}

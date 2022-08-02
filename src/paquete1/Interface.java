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
        Dog perro = new Dog(0, "Pitbull", true, 123, "1", "cratus", 1, "cafe", "saludable");
        Cat gato = new Cat(0, "Criollo", 123, "123", "margin", 1, "Verde", "saludable");
        
        System.out.println(perro.getAnimalType());
        System.out.println("" + gato.getAnimalType());
        
        
        System.out.println(perro.getNumberOfBones());
        System.out.println("" + gato.getNumberOfBones());
    }
}

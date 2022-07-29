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
public class polymorphism3 {

    public static void main(String[] args) {
        Dog perro = new Dog("Pitbull", true, "123", "Cratus", 1, "cafe", "Saludable");
        
        
        perro.WalkAround();
        perro.WalkAround(10);
        perro.WalkAround(true);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import paquete2.Cat;
import paquete2.Dog;
import paquete2.Pet;

/**
 *
 * @author fmunoz
 */
public class ModelCat {

    public ModelCat() {
    }
    
    public boolean CreatePet(Cat gato) {
        try {
            
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean EditPet(Cat gato) {
        try {
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean DeletePet(Cat gato) {
        try {
           
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Pet SearchPet(String code) {
        Cat cat = null;
        try {
           
            return cat;
        } catch (Exception e) {
            return cat;
        }
    }
}

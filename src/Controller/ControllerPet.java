/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import paquete2.*;

/**
 *
 * @author fmunoz
 */
public class ControllerPet {

    private ModelDog modelDog;
    private ModelCat modelCat;

    public ControllerPet() {
        this.modelDog = new ModelDog();
        this.modelCat = new ModelCat();
    }

    public boolean CreatePet(Pet pet) {
        try {
            switch (pet.getAnimalType()) {
                case "Gato":
                    this.modelCat.CreatePet((Cat) pet);
                    break;
                case "Perro":
                    this.modelDog.CreatePet((Dog) pet);
                    break;

            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean EditPet(Pet pet) {
        try {
            switch (pet.getAnimalType()) {
                case "Gato":
                    this.modelCat.EditPet((Cat) pet);
                    break;
                case "Perro":
                    this.modelDog.EditPet((Dog) pet);
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean DeletePet(Pet pet) {
        try {
            switch (pet.getAnimalType()) {
                case "Gato":
                    this.modelCat.DeletePet((Cat) pet);
                    break;
                case "Perro":
                    this.modelDog.DeletePet((Dog) pet);
                    break;

            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Pet SearchPet(String code, String type) {
        Pet pet = null;
        try {
            switch (type) {
                case "Gato":
                    pet = this.modelCat.SearchPet(code);
                    break;
                case "Perro":
                    pet = this.modelDog.SearchPet(code);
                    break;

            }
            return pet;
        } catch (Exception e) {
            return null;
        }
    }
}

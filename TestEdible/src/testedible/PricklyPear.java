/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testedible;

/**
 * Moses A Saah Jr
 * Csc 206 Intermediate programming
 * Dr. Osborne 
 * April 26, 2023
 * This concrete class  PricklyPear implements the operation of a PricklyPear fruit which extends 
 * from the super class Fruit. It contains a constructor and methods (implemented)
 */
public class PricklyPear extends Fruit implements Edible {

    // Constructor
    public PricklyPear() {
        this.isGrownon = " rocky hillsides";
    }

    // Methods
    public String getIsGrownon() {
        return isGrownon;
    }
    
    // implemented methods
    @Override
    public String howGrown() {
        return "PricklyPear: It's grown on " + this.getIsGrownon();
    }

    @Override
    public String howToEat() {
        return "PricklyPear: Eaten roasted";
    }
}

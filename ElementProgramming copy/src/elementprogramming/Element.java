/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementprogramming;

/**
 * Moses A Saah Jr
 * CSC 201 PROGRAM 7.2 
 * Dr. Osborne 
 * March 02, 2023 
 * Using the Element class, This  program calculates the molecular weight of the 
 * following chemicals Glucose, Epinephrine, Acetic Acid and Sodium Bicarbonate
 */
public class Element {
    // Private data members or Variables
    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    public Element() {
    }
    // Parameterized constructor 
    public Element(String name, String symbol, int atomicNumber, double atomicWeight) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    // Getters and Setters Method for the private variables 
    public String getName() {
        return name; // returns the name of the element
    }
    
    public void setName(String name) {
        this.name = name; // Sets the name of the Element
    }

    public String getSymbol() {
        return symbol;  // Sets the element's symbol 
    } 

    public void setSymbol(String symbol) {
        this.symbol = symbol; // Sets the element's symbol
    }

    public int getAtomicNumber() {
        return atomicNumber; // returns the atomicNumber 
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber; // sets the atomicNumber
    }

    public double getAtomicWeight() {
        return atomicWeight; // returns the atomicWeight 
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight; // Sets the atomicWeight 
    }
    
    // ToString Method
    @Override
    public String toString() {
        return name + ", has symbol " + symbol + ", atomicNumber " + atomicNumber + ", and atomicWeight " + atomicWeight ;
    }
}

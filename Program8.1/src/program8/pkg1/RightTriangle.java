/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program8.pkg1;

/**
 * Moses A Saah Jr
 * Csc 206 Intermediate programming
 * Dr. Osborne 
 * April 19, 2023
 * This class implements the operation of a Right Triangle with getters and setters of the 
   instance variables, base and height. And getArea, getPerimeter and a tostring method. 
 */
public class RightTriangle extends GeometricObject {
    // The instance variables
    private double base;
    private double height;

    // No-Arg CONSTRUCTOR
    public RightTriangle() {
        this.base  = 0.0;
        this.height = 0.0;
    }

    // Perimeterized CONSTRUCTORS
    public RightTriangle(double base, double heignt) {
        this.base = base;
        this.height = heignt;
    }

    public RightTriangle(double base, double heignt, String color, boolean filled) {
        super(color, filled);   // Super class contructor is called
        this.base = base;       // Sets the base variable
        this.height = heignt;   // Sets the height variable
    }

    // METHODS OF THE CLASS
    // This method returns the base of the right triangle object 
    public double getBase() {
        return base;
    }

    // This method sets or initialize the base of the right triangle object 
    public void setBase(double base) {
        this.base = base;
    }

    // This method returns the height of the right triangle object 
    public double getHeignt() {
        return height;
    }

    // This method sets or initialize the height of the right triangle object 
    public void setHeignt(double heignt) {
        this.height = heignt;
    }
    
    // This method calculates and return the are of the right triangle object 
    public double getArea() {
        return 0.5 * (base * height); // 1/2 (base * height) formular
    }
    
    // This method calculates and return the perimeter of the right triangle object 
    public double getPerimeter() {
        // calculate and return the perimeter
        return  base + height + Math.sqrt(height * height + base * base);
    }

    @Override
    public String toString() {
        return "RightTriangle{" + "base=" + base + ", heignt=" + height + '}';
    }
}

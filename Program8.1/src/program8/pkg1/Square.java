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
 * This class implements the operation of a Square with getters and setters of the 
   instance variable side with a getArea, getPerimeter and a tostring method. 
 */
public class Square extends GeometricObject {
    // Instance Variables
    private double side;

    // NO-Arg CONSTRUCTOR
    public Square() {
    }

    // Perimeterized CONSTRUCTORS
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);   // Super class contructor is called
        this.side = side;       // Sets the side variable
    }

    // METHODS OF THE CLASS
    // This method returns the side of the square object 
    public double getSide() {
        return side;    // side of the square is return
    }

    // This method sets or initialize the side of the square object 
    public void setSide(double side) {
        this.side = side;
    }
    
    // This method calculates and return the area of the square object 
    public double getArea() {
        return side * side;
    }
    
    // This method calculates return the perimeter of the square object 
    public double getPerimeter() {
        return 4 * side;
    }

    // The toString method gives info of the class. 
    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program8.pkg1;

import java.util.Date;

/**
 * Moses A Saah Jr
 * Csc 206 Intermediate programming
 * Dr. Osborne 
 * April 19, 2023
 * This Super class implements the operations and modifications of a Geometric Object with getters and setters method of the 
   instance variables, color and filled and dateCreated.
 */
public class GeometricObject {
    // Private Data members
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    
    // No-Arg CONSTRUCTOR   
    public GeometricObject() {
        this.color = "white";   // default value for color
        this.filled = false;    // default value for filled. 
        this.dateCreated = new java.util.Date();
    }
    
    // Perimeterized CONSTRUCTORS
    public GeometricObject(String color, boolean filled) {
        // Instance variables are intialize to the values passed.
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date(); // set to current date
    }
    
    // METHODS OF THE CLASS
    // This method returns the color of the Geometric object 
    public String getColor() {
        return color;
    }

    // This method sets or initialize the color of the Geometric object
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    // This method sets or initialize the filled variable of the Geometric object
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // This method returns the Date of the Geometric object 
    public Date getDateCreated() {
        return dateCreated;
    }
    
    // This method sets or initialize the Date created of the Geometric object 
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "The GeometricObject{" + "color = " + color + ", filled = " + filled + ", dateCreated = " + dateCreated + '}';
    }
}

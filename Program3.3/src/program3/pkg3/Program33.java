/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program3.pkg3;

/**
 * Moses A Saah Jr
 * CSC 201 Program 3.3
 * Dr. Osborne 
 * Feb 12, 2023
 *  This program generates random coordinates and checks whether the coordinates 
 *  are in the circle that is centered (0,0) with radius 12.  
 */
public class Program33 {

  public static void main(String[] args) {
    // Variables declared and initialized
    double randomDistance;
    double xCor = (Math.random() * 15);        //  x coordinate
    double yCor = (Math.random() * 15);        //  y coordinate
    // Distance calculation 
    randomDistance =  Math.sqrt(xCor * xCor + yCor * yCor);
    // Checks if the distance is found with in the circle and prints the result
    if (randomDistance <= 12) {
        System.out.printf("The points (%.2f, %.2f), and it's distance %.2f is inside "
                + "the circle", xCor, yCor, randomDistance);
    } else { 
        System.out.printf("The points (%.2f, %.2f), and it's distance %.2f is not inside "
            + "the circle", xCor, yCor, randomDistance);
    }
  }
}

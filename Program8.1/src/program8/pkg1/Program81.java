/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program8.pkg1;

/**
 *Moses A Saah Jr
 * Csc 206 Intermediate programming
 * Dr. Osborne 
 * April 19, 2023
 * This is a test program to implement the classes in this package.
 */
public class Program81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // GEOMETRIC OBJECT 
        GeometricObject object1 = new GeometricObject("yellow", true);
        System.out.println("object1: " + object1.toString());
        
        // NO-arg
        GeometricObject object2 = new GeometricObject();
        object2.setColor("black");
        object2.setFilled(true);  
        System.out.println("object2: " + object2.toString());
        
        System.out.println();
        // GEOMETRIC OBJECT: Squares 
        Square square1 = new Square();
        square1.setColor("Blue");
        square1.setFilled(false);
        square1.setSide(8.9);
        System.out.println("Square1: " + square1.toString()+ "and date: " +square1.getDateCreated());
        System.out.printf("Area is %.2f and the perimeter is %.2f and the color is %s\n",
                square1.getArea(), square1.getPerimeter(), square1.getColor());

        // testing with perimeterized
        Square square2 = new Square( 6.8, "Red", true);
        System.out.println("Square2: " + square2.toString()+ "and date: " +square2.getDateCreated());
        System.out.printf("Area is %.2f and the perimeter is %.2f and the color is %s\n",
                square2.getArea(), square2.getPerimeter(), square2.getColor());
        System.out.println();
        
        // GEOMETRIC OBJECT: Right Triangles 
        RightTriangle Right_Triangle1 = new RightTriangle();
        Right_Triangle1.setColor("Blue");
        Right_Triangle1.setFilled(true);
        Right_Triangle1.setBase(8.6);
        Right_Triangle1.setHeignt(3.2);
        System.out.println("Right_Triangle1: " + Right_Triangle1.toString() + "and date: " +Right_Triangle1.getDateCreated());
        System.out.printf("Area is %.2f and the perimeter is %.2f and the color is %s\n",
                Right_Triangle1.getArea(), Right_Triangle1.getPerimeter(), Right_Triangle1.getColor());
        // testing with perimeterized
        RightTriangle Right_Triangle2 = new RightTriangle( 5.5, 8.6,  "Yellow",  true);
        System.out.println("Right_Triangle2: " + Right_Triangle2.toString());
        System.out.printf("Area is %.2f and the perimeter is %.2f and the color is %s\n",
                Right_Triangle2.getArea(), Right_Triangle2.getPerimeter(), Right_Triangle2.getColor());
        
        
        
        
        
        
    }
    
}

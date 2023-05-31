/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testedible;

/**
 * Moses A Saah Jr
 * Csc 206 Intermediate programming
 * Dr. Osborne 
 * April 26, 2023
 * This is a test program to implement and test the classes in this package.
 */
public class TestEdible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        // An array or objects is created.
        Object[] objects = {new Chicken(), new Tiger(), new Cherry(), new PricklyPear()};
        // Iterates over the objets 
        for (int i = 0; i < objects.length; i++) {
            // Checks the supper class each object is inheriting from.
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }
            if (objects[i] instanceof Fruit) {
                System.out.println(((Fruit) objects[i]).howGrown());
            }
        }
    }
}

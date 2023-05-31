/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program7.q;
import java.util.Random;

/**
Moses A Saah Jr
 * Csc 206 Intermediate programming
 * Dr. Osborne 
 * April 11, 2023
 * This is a test program that will thoroughly test the MyQueue class.
 */
public class Program7Q {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue testQueue = new MyQueue();
        // Test before enqueing values into the queue
        System.out.println("The Size is: "+ testQueue.getSize());
        System.out.println("The first element is: " + testQueue.peek());
        System.out.println("Is the queue empty: " + testQueue.isEmpty());
        System.out.println("----------------------------------");
        System.out.println("Testing with values in the queue...");
        System.out.println("----------------------------------");
        // Add item to the queue
        for (int i = 1; i <= 16; i++) {
            testQueue.enqueue(i);
        }
        // Testing the methods.
        System.out.println("The Size is: "+ testQueue.getSize());
        System.out.println("The first element is: " + testQueue.peek()); 
        System.out.println("Is the queue empty: " + testQueue.isEmpty());
        System.out.println("----------------------------------");

        // Dequeue items from the queue.
        for (int i = 0; i <= 15; i++) {
            System.out.println("The first element is: " + testQueue.peek()); 
            testQueue.dequeue(i);
            System.out.println("The Size is: "+ testQueue.getSize());
        }
    }
    
}

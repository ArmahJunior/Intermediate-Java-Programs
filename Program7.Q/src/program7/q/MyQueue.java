/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program7.q;

/**
 * Moses A Saah Jr
 * Csc 206 Intermediate programming
 * Dr. Osborne 
 * April 11, 2023
 * This class implements the operation of a queue. A Queue object is created with default capacity 8
   The methods enqueue (int item), dequeue(), peek(), isEmpty(), and getSize()
 */
public class MyQueue {
    // An array of integers (int[]) named item to hold the queue items
    private int [] item;
    // A data field named size that stores the number of items in the queue
    private int size;
    // A constructor that creates a Queue object with default capacity 8
    int counter;
    public MyQueue () {
        this.size = 8;
       item  = new int[size];
       counter = 0;
    }
    // The methods enqueue(int item) add an item to the end of the queue
    public void enqueue(int item){
        // if the number of items exceeds the size, the array size will be doubled.
        if (counter == size){
            // New array is created and initialize to twice the size of the old one
            int[] newQueue = new int[size * 2];
            // values are copy over to the new aray
            for (int i = 0; i < counter; i++) {
                newQueue[i] = this.item[i];
            }
            this.item = newQueue;
            size = size * 2;
        }
        // Value is inserted
        this.item[counter] = item;
        counter++;
    }
 
    // THis Method dequeue(), To dequeue an item, 
    public int dequeue(int item){
        int rc;
        if (isEmpty()){
            rc = -1;
        }
        // The value of the first item kept so it can be returned
        rc = this.item[0];
        // The remaining values “scooted” down The size of the queue adjusted
        for ( int i = 0; i < this.item.length - 1; i++) {
            this.item[i] = this.item[i+1];
        }
        counter--;
        return rc;
    }
    
    // This method returns the value at the front of the queue remove it from the queue
    public int peek(){
        if (isEmpty()) {
            return -1;
        }
        return this.item[0];
    }
    // isEmpty() returns TRUE or FALSE depending on whether size equals zero or not
    public boolean isEmpty() {
       return counter == 0; 
    }
    // The getSize() method returns the current number of items in the queue
    public int getSize() {
        return counter;
    }
}

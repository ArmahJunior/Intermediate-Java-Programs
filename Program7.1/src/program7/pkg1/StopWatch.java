/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program7.pkg1;
import java.time.LocalTime;

/**
 * Moses A Saah Jr
 * CSC 201 PROGRAM 7.1 
 * Dr. Osborne 
 * March 30, 2023
 * This is program  class simulates the operation of a stopWatch. functions include:
 * calculating start time, stop time, and elapse time. 
 */
public class StopWatch {
    // Private data fields startTime and stopTime.
    private long startTime;
    private long stopTime;
    
    // A no-arg constructor that initializes startTime and stopTimewith the current time.
    public StopWatch() {
        startTime = System.currentTimeMillis();
        stopTime = System.currentTimeMillis();
    }
    
    // A method named start() that sets the startTime to the current time.
    public void start(){
        startTime = System.currentTimeMillis(); // 1000;    
    }
    
    // A method named stop() that sets the stopTime to the current time
    public void stop(){
        stopTime = System.currentTimeMillis();    
    }
    
    // This method that returns the elapsed time for the stopwatch in milliseconds
    public long getElapsedTime() {
        return (stopTime - startTime);
    }
    
    // This method returns current time in milliseconds
    public long getStartTime() {
        return startTime;
    }
    
    // This method returns current time in milliseconds
    public long getStopTime() {
        return stopTime;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program7.pkg1;

/**
 * Moses A Saah Jr
 * CSC 201 PROGRAM 7.1 
 * Dr. Osborne 
 * March 30, 2023
 * This  is program driver that uses the StopWatch class to determines the
   individual times required to create and load three separate arrays of random
   floating point (double) numbers of size 10,000, 100,000, and 1,000,000. it Displays the
   elapsed times in seconds.
 */
 
public class Program71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StopWatch newWatch = new StopWatch();
        
        // FIRST LOOP
        // startime is initialize the current time in milliseconds 
        newWatch.start();   
        // Array is created and initialize to the size of 10000 
        double[] fArray = new double [10000];
        // every index in the array is populated with a random valeu
        for ( int i  = 0; i < fArray.length; i++ ) {
            fArray[i] = Math.random() * 10;
        }
        // Startime is initialize the current time in milliseconds 
        newWatch.stop();
        // elapse time is return 
        double elapsed1 = newWatch.getElapsedTime();
        
        
        // Second Loop
        // startime is initialize the current time in milliseconds 
        newWatch.start(); 
        // Array is created and initialize to the size of 10000 
        double[] sArray = new double [100000];
        // every index in the array is populated with a random valeu
        for ( int i  = 0; i < sArray.length; i++ ) {
            sArray[i] = Math.random() * 10;
        }
        newWatch.stop();
        // elapse time is return 
        double elapsed2 = newWatch.getElapsedTime();
        
        // Third Loop
        // start time is initialize to the current time in milliseconds 
        newWatch.start();
        // Array is created and initialize to the size of 10000 
        double[] tArray = new double [1000000];
        // every index in the array is populated with a random valeu
        for ( int i  = 0; i < tArray.length; i++ ) {
            tArray[i] = Math.random() * 10;
        }
        newWatch.stop();
        // elapse time is return 
        double elapsed3 = newWatch.getElapsedTime();
        
        // Converts the elapse time to seconds and prints the OutPut 
        System.out.println("Array sizes    Required Time");
        System.out.println("-----------    -------------");
        System.out.println("10k:             " + elapsed1 / 1000 );
        System.out.println("100k:            " + elapsed2 / 1000 );
        System.out.println("1M:              " + elapsed3 / 1000 );  
    }
    
}

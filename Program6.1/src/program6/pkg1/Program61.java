/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program6.pkg1;

import java.util.Random;

/**
 * Moses A Saah Jr
 * CSC 201 PROGRAM 6.1 
 * Dr. Osborne 
 * March 21, 2023
 * This program generates and array of random doubles values in range of 0.0 - 100.0
   and perform the following operations on the array: Calculate the minimum and 
   maximum values in the array, the mean and median Sort the array of integers 
   in descending order using a selection sort, and Display the values.
 */
public class Program61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declere and initialized the array with 10 ramdom values.
        double array[] = generateIntArray(10);
        // Displays column the “before sort” 
        System.out.println("Before Sort   |");
        System.out.println("---------------");
        // This forloop iterates over the values and print them.
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-14.2f| \n", array[i]);
        }
        
        // Outputs the minimum and maximum values in the array, callin the methods
        System.out.println("Minimum: " + min(array));
        System.out.println("Maximum: " + max(array));
        // Outputs the mean and median and of the values in the array.
        System.out.printf("Mean: %.2f \n", mean(array));
        System.out.printf("Median: %.2f \n", median(array)); 
        System.out.println();
        // Displays column the “before sort” 
        System.out.println("After Sort    |");
        System.out.println("---------------");
        
        // Sort the array in ascending order
        selectionSort(array);

        // Display values from the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-14.2f| \n", array[i]);
        }      
        
        // Calculate the minimum and maximum values in thearray,
        System.out.println("Minimum: " + min(array));
        System.out.println("Maximum: " + max(array));
        // Calculate the mean and median and of the values in the array.
        System.out.printf("Mean: %.2f \n", mean(array));
        System.out.printf("Median: %.2f \n", median(array)); 
    }
    
    // METHODS FOR THE MAX, MIN, MEAN and MEDIAN.
    
    //  This method generates random double valuse and return an array of the values based on the size passed.
    public static double[] generateIntArray(int arraySize) {
        // Array of double type to be return
        double [] x = new double[arraySize];
        // The loop initializes every index with a random generated values
        for ( int i =  0; i < arraySize; i++) {
            x[i] = (Math.random() * 99); 
        }
        return x; // array with generated values
    }
    
    // This method sorts values in the array in descending form.
    public static void selectionSort(double[] x) {
        // Variables to hold the current position and temp position or indexes
        int currentMinIndex;
        int temp;
        for (int i = 0; i < x.length - 1; i++) {
        // Find the minimum in the list[i..list.length-1]
            currentMinIndex = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] > x[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                temp = (int)x[i];
                x[i] = x[currentMinIndex]; 
                x[currentMinIndex] = temp; 
            } 
            if (currentMinIndex != i) {
                swap((int)x[i], (int)x[currentMinIndex]);
            }
        }    
    } 
    
    //  This method swaps the value of two variables.
    public static void swap(int a, int b) {
        // extra variable is declare to Swap values
        int temp = a;
        // SWAP
        a = b;
        b = temp; 
    } 
 
    // This method finds and return the index of the minimum value in the array.
    public static int min(double[] x) { 
        // variable holds the first value in the array
        double  min = x[0]; 
        int rc = 0;
        // The minimum value is found and the index of that value is returned.
        for ( int i  = 1; i <x.length; i++) { 
            if( x[i] < min){ 
                min = x[i]; 
                rc = i;
            }
        }      
        return rc;
    }
    
    // This method finds and return the index of the maximum value in the array
    public static int max(double[] x) {
        int max = (int)x[0];
        int rc = 0;
        // The minimum value is found and the index of that value is returned.
        for ( int i  = 1; i <x.length; i++) {
            if( x[i] > max){
                max = (int)x[i];
                rc = i;
            }
        }
        return rc;
    }
   
    // This method return s the mean value from the arrau
    public static double mean(double[] x) {
        double sum = 0.0;
        for ( int i  = 0; i < x.length; i++) {
                sum += x[i];
        }
        return sum / x.length;
    }
   
    // This method return s the mean value from the array
    public static double median(double[] x) {
        double median = 0;
        // Selection sort the array
        selectionSort(x);
        // First checks if the length of the list is even
        if ( x.length % 2 == 0){
            // if even, the first and last value is calculated.
            double nfirst =  x[(x.length / 2) - 1] ;
            double nsecond = x[x.length / 2];
            median = (nfirst + nsecond) / 2;           
        } else {
            // if the list is odd, then the middle will be determine by the code below
            median = x[(x.length - 1) / 2 ];
        } 
        // the median is retured 
        return median;  
    }  
}

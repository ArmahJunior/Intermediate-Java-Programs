/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program5.pkg10;

import java.util.Scanner;

/**
 * Moses A Saah Jr 
 * CSC 201 Program 5.1 
 * Dr. Osborne Feb 22, 2023 
 * This program
   prints the pascal triangle based on the number of levels entered by a user.
   Both factorial and combination functions are user to implement this program.
 */
public class Program510 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Prompt the user for the rows
        System.out.println("Hi, Enter the number of rows for the Pascal triangle: ");
        // User input is stored in n
        int n = input.nextInt();
        System.out.println("Pascal's traingle for n = " + n + ":");

        // Create an outer loop, “i”, executing n times to print rows
        int i, j;
        for (i = 0; i <= n; i++) {
            // Make inner loop, “j”, executing n - i times
            for (j = 0; j <= n - i; j++) {
                // Print single blank space " "
                System.out.print(" ");
            }
            // Make a second inner loop, “j”, executing i times
            for (j = 0; j <= i; j++) {
                // Print a single space and the nCr of i and j.  
                System.out.print(" " + nCr(i, j));
            }
            System.out.println();

        }
    }

    // Methods calculates the factorial of a number
    public static int factorial(int n) {
        int nFact = 1;
        // For loop starts from 1 to n times 
        for (int i = 1; i <= n; i++) {
            // mutiplies nfact by i until ntimes. 
            nFact *= i;
        }
        return nFact;
    }

    // This method returns the number combinations of r from n. 
    public static int nCr(int n, int r) {
        // calculates the combination 
        double value = ((double) factorial(n) / (factorial(n - r) * (factorial(r))));
        return (int) value;
    }
}


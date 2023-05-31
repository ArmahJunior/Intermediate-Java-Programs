/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program2.pkg1;

import java.util.Scanner;

/**
 * Moses A Saah Jr
 * CSC 201 Program 2.1
 * Dr. Osborne 
 * Feb 10, 2023
 *  This program prompts the user to enter a 4-digit
    binary number as a string and then displays its
    corresponding decimal value. No loops and wrapper class methods included 
 */
public class Program21 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Varables:
        String userInput;
        int decimalValue;
        
        // Prompt the user to enter a 4-digit binary number
        System.out.println(" Enter a four digit binary number: ");
        userInput = input.nextLine();
        
        // Converts the Binary to Decimals using the index of the binary string
        decimalValue = (userInput.charAt(0) - '0') * 8 +(userInput.charAt(1) - 
                '0') * 4 + (userInput.charAt(2) - '0') * 2 +(userInput.charAt(3) - '0');
        // Prints the result
        System.out.println("The Decimal value of your binary number is: " + decimalValue);
    }
    
    
}

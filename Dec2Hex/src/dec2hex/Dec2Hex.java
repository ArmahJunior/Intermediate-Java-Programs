/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dec2hex;

import java.util.Scanner;

/**
 *
 * @author mosessaah
 */
public class Dec2Hex {

/** Main method */
    public static void main(String[] args) {
    // Declare variables
        int decimal;
        int hexValue;
        char hexDigit;
        String hexString = "";
        Scanner input = new Scanner(System.in);
       
        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal number: ");
        decimal = input.nextInt();
        
        // Convert decimal to hex using remainder division
        while (decimal != 0) {
            hexValue = decimal % 16;
            
            if (hexValue <= 9 && hexValue >= 0)
                hexDigit = (char)(hexValue + '0');
            else
                hexDigit = (char)(hexValue - 10 + 'A');
                hexString = hexDigit + hexString;
                decimal = decimal / 16;
        }
            //Output the hex string
               System.out.println("The hex number is " + hexString);
    }
}


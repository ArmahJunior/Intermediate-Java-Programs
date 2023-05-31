/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program4.pkg1_roller;

import java.util.Scanner;

/**
 Moses A Saah Jr
 * CSC 201 Program 4.1
 * Dr. Osborne 
 * Feb 19, 2023  
 * This program simulates the rolling of a 10-sided die a number of times
   specified by the user, then displays the number of times that each side is 
   rolled, as well as its percentage of the total rolls. The implementation is
   based on Chapter 1-4
 */
public class Program41_Roller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        // Variables
        int side_0 = 0;         // Side 0 of the dice 
        int side_1 = 0;         // Side 1 of the dice 
        int side_2 = 0;         // Side 2 of the dice 
        int side_3 = 0;         // Side 3 of the dice 
        int side_4 = 0;         // Side 4 of the dice 
        int side_5 = 0;         // Side 5 of the dice 
        int side_6 = 0;         // Side 6 of the dice 
        int side_7 = 0;         // Side 7 of the dice 
        int side_8 = 0;         // Side 8 of the dice 
        int side_9 = 0;         // Side 9 of the dice 
        int count;
        int dice; 
        // Prints the numbers on the die
        System.out.println("How many rolls of the dice do you want? ");
        count = input.nextInt();
        System.out.println("Calculating for " + count +" rolls... " );
        
        int i = 0;
        // Loops until the number of rolls specified by the user is reach.
        while (i < count) {
            // Random number is generated for the dice
            dice = (int) (Math.random() * 10);
            i++ ;       // counter is incremented  
            // The follow conditions checks the dice sides  
            if ( dice == 0) {
                side_0++;
            } else if (dice == 1 ) {
                side_1++;
            }else if (dice == 2 ) {
                side_2 ++;
            }else if (dice == 3 ) {
                side_3++;
            }else if (dice == 4 ) {
                side_4++;
            }else if (dice == 5 ) {
                side_5++;
            }else if (dice == 6 ) {
                side_6 ++;
            }else if (dice == 7 ) {
                side_7 ++;
            }else if (dice == 8 ) {
                side_8 ++;
            }else  {
                side_9 ++;       
            }
        }
        // OutPut from the calculations.
        System.out.println("Side of dice        Count         Percentage");
        System.out.println("------------       --------      --------------");
        System.out.printf(" Zeros %18d %15.2f%%\n", side_0, ((double) side_0/count)*100);
        System.out.printf(" Ones %19d %15.2f%%\n", side_1, ((double) side_1/count)*100);
        System.out.printf(" Twos %19d %15.2f%%\n", side_2, ((double) side_2/count)*100);
        System.out.printf(" threes %17d %15.2f%%\n", side_3, ((double) side_3/count)*100);
        System.out.printf(" Fours %18d %15.2f%%\n", side_4, ((double) side_4/count)*100);
        System.out.printf(" Fives %18d %15.2f%%\n", side_5, ((double) side_5/count)*100);
        System.out.printf(" Sixes %18d %15.2f%%\n", side_6, ((double) side_6/count)*100);
        System.out.printf(" Sevens %17d %15.2f%%\n", side_7, ((double) side_7/count)*100);
        System.out.printf(" Eights %17d %15.2f%%\n", side_8, ((double) side_8/count)*100);
        System.out.printf(" Nines %18d %15.2f%%\n", side_9, ((double) side_9/count)*100);
    }
}

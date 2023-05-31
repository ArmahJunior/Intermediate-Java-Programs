/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testforpascal;

/**
 *
 * @author mosessaah
 */
public class TestForPascal {

    
    public static void main(String[] args)
    {
        int n = 8;
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
 
                // nCr formula
                System.out.print(
                    " "
                    + factorial(i)
                          / (factorial(i - j)
                             * factorial(j)));
            }
 
            // for newline
            System.out.println();
        }
    }
    
    public static int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
}


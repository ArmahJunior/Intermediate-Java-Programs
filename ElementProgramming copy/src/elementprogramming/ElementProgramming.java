/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elementprogramming;

/*
 Moses A Saah Jr
 * CSC 201 PROGRAM 7.2 
 * Dr. Osborne 
 * March 02, 2023 
 * Using the Element class, This program calculates the molecular weight of the 
 * following chemicals Glucose, Epinephrine, Acetic Acid and Sodium Bicarbonate
 */
public class ElementProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates new elements and load them
        Element carbon = new Element("Carbon", "C", 6, 12.011);
        Element nitrogen = new Element("Nitrogen", "N", 7, 14.007);
        Element hydrogen = new Element("Hydrogen", "N", 1, 1.008);
        Element oxygen = new Element("Oxygen", "N", 8, 15.999);
        Element sodium = new Element("Sodium", "Na", 11, 22.99);

        //CALCULATE AND PRINT THE MOLECULAR WEIGHT  OF THE COMPOUNDS
        
        // Glucose (C 6 H 12 O6 )
        System.out.println(carbon.toString()
                + "\n" + hydrogen.toString()
                + "\n" + oxygen.toString()
                + "\n" + "Blood sugar cose has a chemical formula of C 6 H 12 O6 and a molecular weight of "
                + +(6 * carbon.getAtomicWeight() + 12 * hydrogen.getAtomicWeight() + 6 * oxygen.getAtomicWeight()));
        System.out.println();

        // • Epinephrine (C 9 H 13 NO3 )
        System.out.println(carbon.toString()
                + "\n" + hydrogen.toString()
                + "\n" + nitrogen.toString()
                + "\n" + oxygen.toString()
                + "\n" + "Adrenaline has a chemical formula of C 9 H 13 NO3  and a molecular weight of "
                + +(9 * carbon.getAtomicWeight() + 13 * hydrogen.getAtomicWeight()
                + nitrogen.getAtomicWeight() + 3 * oxygen.getAtomicWeight()));
        System.out.println();
        
        // • Acetic Acid (CH 3 COOH)
        System.out.println(carbon.toString()
                + "\n" + hydrogen.toString()
                + "\n" + oxygen.toString()
                + "\n" + "Vinegar has a chemical formula of (CH 3 COOH)  and a molecular weight of "
                + +(carbon.getAtomicWeight() + 3 * hydrogen.getAtomicWeight()
                + +carbon.getAtomicWeight() + 2 * oxygen.getAtomicWeight()
                + hydrogen.getAtomicWeight()));
        System.out.println();
        
        //  Sodium Bicarbonate (NaHCO3)
        System.out.println(sodium.toString()
                + "\n" + hydrogen.toString()
                + "\n" + carbon.toString()
                + "\n" + oxygen.toString()
                + "\n" + " Baking soda has a chemical formula of (CH 3 COOH)  and a molecular weight of "
                + (sodium.getAtomicWeight() + hydrogen.getAtomicWeight()
                + + carbon.getAtomicWeight() + 3 * oxygen.getAtomicWeight()));
    }

}

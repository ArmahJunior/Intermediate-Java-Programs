/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testedible;

/**
 *
 * @author mosessaah
 */
public class Chicken extends Animal implements Edible {
    
    public Chicken() {
        
    }
    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-do";
    }

    @Override
    public String howToEat() {
        return "Chicken: Bread and fry it!";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playingcards;

/**
 Samuel Obeng
 * CSC 206 Intermediate Programing 
 * P3
 * Dr. Wheat
 * March 10, 2023
 * This program...
 */
public class PlayingCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Declares and instantiates a drawPile of type Deck with 52 cards.
    Deck drawPile= new Deck(52);
    // Declares and instantiates an array of size 2 called “hands” of type Deck.
    Deck[] hands = new Deck[2];  
    // For each hand entry, assign the reference to an object of type Deck where the capacity of that object is 5 cards.
    for (int i = 0; i<hands.length;i++) {
        hands[i] = new Deck();
    }
    // Declares and instantiates a discardPile of type Deck with 52 cards. but it will not (yet) have any cards.
    Deck Disdrawpile= new Deck(52);
    // Make the following calls:
    drawPile.buyCards();            
    drawPile.printDeck("Before Shuffle");
    drawPile.shuffleDeck(5);
    drawPile.printDeck( "After Shuffle");
    hands[0].dumpDeck("Hands[0]");
    //the necessary loops to deal 5 cards to each hand as normally done.
    for (int i = 0; i < 5; i++) {
            for (Deck hand : hands) {
                hand.takeTopCard();
            }
    }
    hands[0].dumpDeck("Hands[0]");
    hands[1].dumpDeck("Hands[1]");
    drawPile.dumpDeck("drawPile");
    
    }
    
}

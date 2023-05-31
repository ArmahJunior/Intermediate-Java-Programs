/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playingcards;

import java.util.Random;

/**
 * Samuel Obeng
 * CSC 206 Intermediate Programing 
 * P3
 * Dr. Wheat
 * March 10, 2023
 * This Class Simulates the operations of a deck of cards....
 */
class Deck {
    // Private Variables 
    private final int cardCapacity;         // capacity of the Deck
    private int cardCount;                  // Keeps track og the cards in the Deck
    private int[] cards;                    // An array of cards
    private int[] map;        
    // Stores the four kinds of cards
    private String[] suits = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};

    // No arg contructor 
    public Deck() {
        this.cardCapacity = 5;
        this.cards = new int[cardCapacity];
        this.cardCount = 0;
        setMap();
    }
    // A constructor sets the capacity of the deck specified by the user. It calls setMap()

    public Deck(int cardCapacity) {
        this.cardCapacity = cardCapacity;
        this.cards = new int[cardCapacity];
        this.cardCount = 0;
        setMap();
    }

    // This Method assigns an array of 13 integers to map; then sets the map with each value. 
    private void setMap() {
        this.map = new int[13];
        for (int i = 0; i < 13; i++) {
            this.map[i] = i + 1;
        }
    }

    // This Method Adds the given card to the deck, if there is capacity.
    private void putCardOnTop(int card) {
        if (cardCount < cardCapacity) {
            cards[cardCount++] = card;
        }
    }

    // This method removes and returns the top card of the deck. Returns -1 if there are no cards. 
    public int takeTopCard() {
        int rc;
        // Checks if the deck is empty
        if (cardCount == 0) {
            rc = -1;
        } else {
            // if not empty it returns the top card
            rc = cards[--cardCount];
        }
        return rc;
    }

    // This method Returns the oldest card on the deck or -1 if the deck is empty.
    public int takeBottomCard() {
        int rc;             // Return variable
        // Check if the deck is empty
        if (cardCount == 0) {
            rc = -1;
        } else {
            // The last card is save 
            rc = cards[0];
            // This for loop shift the cards 
            for (int i = 0; i < cardCount - 1; i++) {
                cards[i] = cards[i + 1];
            }
            // count is decremented
            cardCount--;
        }
        return rc;
    }

    // This Method returns the value of the card at the top of the deck.  Returns -1 if the deck is empty
    public int topCardPeek() {
        int rc;
        if (cardCount == 0) {
            rc = -1;
        } else {
            rc = cards[cardCount - 1];
        }
        return rc;
    }
    
    // This method take the top card and put it on the destination deck via takeTopCard and putCardOnTop.
    public void dealToDeck(Deck dest) {
        int card = takeTopCard();
        if (card != -1) {
            dest.putCardOnTop(card);
        }
    }

    // Does a perfect shuffle of the deck as many times as specified by xTimes.
    public void shuffleDeck(int xTimes) {
        Random random = new Random();
        int leftSize = cardCount / 2;
        int rightSize = cardCount - leftSize;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        System.arraycopy(cards, 0, left, 0, leftSize);
        System.arraycopy(cards, 0, right, 0, rightSize);

        for (int i = 0; i < xTimes; i++) {
            int index = 0;
            int leftIndex = 0;
            int rightIndex = 0;

            while (leftIndex < leftSize && rightIndex < rightSize) {
                if (random.nextInt(2) == 0) {
                    cards[index++] = left[leftIndex++];
                } else {
                    cards[index++] = right[rightIndex++];
                }
            }
            while (leftIndex < leftSize) {
                cards[index++] = left[leftIndex++];
            }
            while (rightIndex < rightSize) {
                cards[index++] = right[rightIndex++];
            }
        }

    }

    // This method puts each card [0-51] into the deck, in ascending order 
    public void buyCards() {
        for (int i = 0; i < 52; i++) {
            putCardOnTop(i);
        }
    }

    public void printDeck(String s) {
        System.out.println(s + " : ");

        for (int i = 0; i < cardCount; i++) {
            int card = cards[i];
            int rank = map[card % 13];
            System.out.println(cards[i]);
        }
    }
    
    public void dumpDeck(String s) {
        System.out.println(s + " dump: " + cardCapacity + ", " + cardCount);
        printDeck(s);
    } 
}

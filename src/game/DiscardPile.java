/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.util.ArrayList;

/**
 *
 * @author jhm108
 */
public class DiscardPile {
    
    ArrayList<Card> discardPile = new ArrayList(); 

    void add(Card card) {
        discardPile.add(card);
    }

    public int size(){
    
        return discardPile.size();
    }

    public Card remove() {
       return discardPile.remove(0);
    }
    
    
    
}

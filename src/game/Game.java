/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author jhm108
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        GameGUI  g = new GameGUI();
g.setVisible(true);

        
        
       
        Deck myDeck = new Deck(); 
        myDeck.createCards();
        myDeck.shuffle();
    
}
}
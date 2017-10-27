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
public class Card {
    private int suit, value;  
    private String[] cardSuit = {"Spades", "Diamonds","Hearts", "Clubs"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10" ,"9",
        "8","7","6","5","4","3","2"};
    
    public Card(int cSuit, int cValue){

      suit = cSuit; 
      value = cValue;

    }

    Card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){

    String cardInfo = cardValue[value] + " of " + cardSuit[suit];
    return cardInfo;
    }   
    
    public String getImage(){
        String imageName = cardValue[value] + cardSuit[suit] + ".png"; 
        return imageName;
    }
    
    public String getValue(){
        return cardValue[value];
    }
    
}


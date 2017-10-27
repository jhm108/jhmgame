/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;


import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author jhm108
 */
public class Deck {
   
    ArrayList <Card> deck = new ArrayList<Card> (); 
int count; 
    
    
    
    public void createCards(){
        
        for (int i = 0; i<4 ; i++){
             for ( int j = 0 ; j< 13 ; j++){
                    Card myCard = new Card(i,j);
                    //System.out.println(myCard);
                    deck.add(myCard); 
                    count++;
             }
        } 
        
        
        System.out.println("::::::::::::::::: " + count);
    }
    
    public void split(){
        deck.subList(0,26);
    }
    
    public void shuffle(){
           Collections.shuffle(deck);
    }
    
    
     public Card getCard(int index){
         Card c = deck.get(index);
         return c;
     }
   
     
     public Card removeCard(){
         return deck.remove(0);
      

    
}

}

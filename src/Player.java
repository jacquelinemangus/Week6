import java.util.ArrayList;
import java.util.List;

public class Player {
	//String shuffle;
    //String draw;
    List<Card> hand = new ArrayList<Card>();
    int score;
    String name;
    
    public Player(String newName) {
    	score=0;
    	name=newName;
    			
    }
    
    
    public void describe(){
    	for (Card card : this.hand) {
			card.describe();
	}
}
    public Card flip() {
    	return hand.remove(0); //invoking 
    }


public void draw(Deck deck) {
	hand.add(deck.draw());
}


public void incrementScore() {
	this.score++; //or i++
}
public int getScore() {
	return score;
}
}






//c.	Player


//i.	Fields

//1.	hand (List of Card)
//2.	score (set to 0 in the constructor)
//3.	name
//ii.	Methods
//1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
//2.	flip (removes and returns the top card of the Hand)
//3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//4.	incrementScore (adds 1 to the Player’s score field)


import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {
	List<Card> cards = new ArrayList<Card>();

	public Deck() {
		String[] suits = { "Diamonds", "Hearts", "Spades", "Clubs", }; // create string array,
																								// iterate over that
																								// array. Start at 0.
																								// Nested loop next
																								// line.
		String[] values = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Jack",  
				"Queen", "King", "Ace"};
		for (String suit : suits) {
			int count = 2;
			for (String numberName : values) {
				cards.add(new Card(count, suit, numberName));
				count++;
			}
		}
	}
	// use a for loop, or use a loop, to assign values 2-14 to each individual card.
	// (diamonds, hearts, spades, clubs). Nested loop?
	// using 2 arrays, to assign

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}

}

//
//b.	Deck
//
//i.	Fields

//1.	cards (List of Card)

//ii.	Methods
//1.	shuffle (randomizes the order of the cards)
//2.	draw (removes and returns the top card of the Cards field)
//3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

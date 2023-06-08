
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		deck.shuffle();

		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
				
			}

		}
		for (int i = 0; i < 26; i++) {
			Card player1Flip = player1.flip();
			Card player2Flip = player2.flip();
			if (player1Flip.getValue() > player2Flip.getValue()) {
				player1.describe();
				System.out.println("competing against");
				player2.describe();
				player1.incrementScore();
				System.out.println("--------------------");
			} else if (player1Flip.getValue() < player2Flip.getValue()) {
				player1.describe();
				System.out.println("competing against");
				player2.describe();
				player2.incrementScore();
				System.out.println("--------------------");
			} else {
				player1.describe();
				System.out.println("competing against");
				player2.describe();
				System.out.println("It's a tie!");
				System.out.println("--------------------");
			}
		}
		System.out.println("Player 1 score is 25" + player1.getScore());
		System.out.println("Player 2 score is 25" + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 is the winner!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 is the winner!");
		} else {
			System.out.println("It is a draw!");
		}

	}
}

//invoke incrementScore method

//2.	Create a class called App with a main method.

//a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
//b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
//c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.
//d)	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
//e)	After the loop, compare the final score from each player. 
//f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

//3.	 Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.
//a)	Using the Card describe() method when each card is flipped illustrates the game play.
//b)	Printing the winner of each turn adds interest.  
//c)	Printing the updated score after each turn shows game progression.
//d)	At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie

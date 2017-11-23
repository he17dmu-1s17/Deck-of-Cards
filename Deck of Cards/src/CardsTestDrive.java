import cards.*;

public class CardsTestDrive {

	public static void main(String[] args) {
		System.out.println("Print suit: " + Suit.Clubs);
		System.out.println("Print card: " + new Card(FaceValue.Three, Suit.Clubs));
		Deck deck = new Deck();
		System.out.println("New deck: " + deck);
		System.out.println(deck.cardCount() + " cards in deck");
		
		Card card = deck.drawCard();
		System.out.println(card + " drawn from deck");
		System.out.println(deck.cardCount() + " cards in deck");
		
		deck.shuffle();
		System.out.println("Shuffled: " + deck);
		
		deck.cut(3);
		System.out.println("Post cut: " + deck);
		
		Card card2 = deck.drawCard();
		System.out.println(card2 + " drawn from deck");
		System.out.println(deck.cardCount() + " cards in deck");
		
		System.out.println(card2 + " higher than " + card + "? " + card2.isHigherThan(card));
		System.out.println(card2 + " same suit as " + card + "? " + card2.getSuit().equals(card.getSuit()));
		
		System.out.println("King higher than Jack? " + new Card(FaceValue.King, Suit.Spades).isHigherThan(new Card(FaceValue.Jack, Suit.Spades)));
		System.out.println("Assigning Black Jack values...");
		FaceValue.setValues(FaceValue.BLACK_JACK_VALUES);
		System.out.println("King higher than Jack? " + new Card(FaceValue.King, Suit.Spades).isHigherThan(new Card(FaceValue.Jack, Suit.Spades)));
		
		System.out.println("Adding second deck to existing deck...");
		deck.addCards(new Deck());
		System.out.println("Deck: " + deck);
		System.out.println(deck.cardCount() + " cards in deck");
		
		System.out.println("Assigning Rommy values...");
		FaceValue.setValues(FaceValue.ROMMY_VALUES);
		System.out.println("Points awarded: " + (card.getFaceValue().getValue() + card2.getFaceValue().getValue()));

	}

}

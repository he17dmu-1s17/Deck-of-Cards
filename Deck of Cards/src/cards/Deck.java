package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>(52);
	
	public Deck() {
		for (Suit suit : Suit.values()) {
			for (FaceValue faceValue : FaceValue.values()) {
				deck.add(new Card(faceValue, suit));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	@Override
	public String toString() {
		return deck.toString();
	}

	public Card drawCard() {
		return deck.remove(0);
	}

	public void cut(int cardsToCut) {
		for (; cardsToCut > 0; cardsToCut--) {
			deck.add(deck.remove(0));
		}
		
//		// Alternativ: De aftagne kort optræder TO GANGE i listen før clear()
//		List<Card> topHalf = deck.subList(0, cardsToCut);
//		deck.addAll(topHalf);
//		deck.subList(0, cardsToCut).clear();
		
//		// Alternativ: Mindre effektiv fordi en ekstra ArrayList skabes
//		ArrayList<Card> topCut = new ArrayList<Card>();
//		topCut.addAll(deck.subList(0, cardsToCut));
//		deck.subList(0, cardsToCut).clear();
//		deck.addAll(topCut);

	}

	public int cardCount() {
		return deck.size();
	}

	public void addCards(Deck cards) {
		deck.addAll(cards.deck);
	}

}

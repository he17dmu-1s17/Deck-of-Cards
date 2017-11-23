package cards;

public class Card implements Comparable<Card> {
	private Suit suit;
	private FaceValue value;
	
	public Card(FaceValue value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	public void UselessMethod() {
		
	}
	
	@Override
	public String toString() {
		return value + " of " + suit;
	}


	@Override
	public int compareTo(Card otherCard) {
		if (this.value.getValue() > otherCard.value.getValue())
			return 1;
		else if (this.value.getValue() < otherCard.value.getValue())
			return -1;
		else
			return 0;
	}

	public boolean isHigherThan(Card otherCard) {
		if (compareTo(otherCard) > 0)
			return true;
		else
			return false;
	}
	
	public void insertMention() {
		System.out.println("why do I need a method to add a sytem.out.print?");
	}

	public Suit getSuit() {
		return suit;
	}

	public FaceValue getFaceValue() {
		return value;
	}

}

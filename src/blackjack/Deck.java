package blackjack;

import java.util.ArrayList;

import blackjack.Card.Rank;
import blackjack.Card.Suit;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck() {
        refill();
    }

    public final void refill() {
      
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add (new Card(suit, rank));
            }
        }
    }

    public Card drawCard() {
        Card card = null;
        while (card == null) {
            int index = (int)(Math.random()*cards.size());
            card = cards.get(index);
            cards.remove(index);
        }
        return card;
    }
}

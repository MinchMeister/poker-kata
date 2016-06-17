package com.manifestcorp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck;
	private final int DECK_SIZE = 52;
	private final int CARDS_PER_SUIT = 13;
	private final char [] CARD_SUIT = {'C', 'D', 'H', 'S'};

	public Deck() {
		deck = new ArrayList<Card>();
		for (int i = 0; i < DECK_SIZE; i++) {
			int cardValue = (i % CARDS_PER_SUIT) + 2; //change to +1 for Ace Low
			char cardSuit = CARD_SUIT[i / CARDS_PER_SUIT];
			Card card = new Card(cardValue, cardSuit);  
			deck.add(card);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder deckContains = new StringBuilder();
		for (Card card : deck){deckContains.append(card.toString() + " ");}
		return deckContains.toString();
	}
	
	public Card getCard(int i) {return deck.get(i);}
	
	public void shuffle() {Collections.shuffle(deck);}
}
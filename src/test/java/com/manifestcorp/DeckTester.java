package com.manifestcorp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeckTester {
	
	private Deck deck1, deck2;
	
	@Before
	public void before() {
		deck1 = new Deck();
		deck2 = new Deck();
	}
	
	@After
	public void after() {
		deck1 = null;
		deck2 = null;
	}
	
	@Test
	public void testGetCard() {
		Card card = new Card(2, 'C');
		assertEquals(card.toString(), deck1.getCard(0).toString());
	}
	
	@Test
	public void testForPopulatedDeck() {
		assertNotNull(deck1);
	}
	
	@Test
	public void testNotForShuffle() {
		assertEquals(deck1.toString(), deck2.toString());
	}
	
	@Test
	public void testForShuffle() {
		deck2.shuffle();
		assertNotEquals(deck1.toString(), deck2.toString());
	}
}

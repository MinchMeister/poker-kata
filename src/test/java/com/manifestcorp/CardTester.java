package com.manifestcorp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CardTester {

	private Card card;
	
	@Before
	public void before() {
		card = new Card(3, 'S');
	}
	
	@After
	public void after() {
		card = null;
	}
	
	@Test
	public void testGetValue() {
		assertEquals(3, card.getValue());
	}
	
	@Test
	public void testNotGetValue() {
		assertNotEquals(4, card.getValue());
	}
	
	@Test
	public void testGetSuit() {
		assertEquals('S', card.getSuit());
	}
	
	@Test
	public void testNotGetSuit() {
		assertNotEquals('H', card.getSuit());
	}
	
	@Test
	public void testToString() {
		assertEquals("3S", card.toString());
	}
	
	@Test
	public void testNotToString() {
		assertNotEquals("3H", card.toString());
	}
}
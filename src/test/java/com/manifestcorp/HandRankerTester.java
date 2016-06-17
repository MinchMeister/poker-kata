package com.manifestcorp;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HandRankerTester {

	private HandRanker pokerRanker;
	private Map<Integer, Long> valueMap;
	private Map<Character, Long> suitMap;

	@Before
	public void before() {
		pokerRanker = new HandRanker();
		valueMap = new HashMap<>();
		suitMap = new HashMap<>();
	}

	@After
	public void after() {
		pokerRanker = null;
		valueMap = null;
		suitMap = null;
	}
	
	@Test
	public void testForStraight(){
		valueMap.put(8, (long) 1);
		valueMap.put(9, (long) 1);
		valueMap.put(10, (long) 1);
		valueMap.put(11, (long) 1);
		valueMap.put(12, (long) 1);
		assertTrue(pokerRanker.checkForStraight(valueMap));
	}
	
	@Test
	public void testCheckForFlush() {
		suitMap.put('C', (long) 5);
		assertTrue(pokerRanker.checkForFlush(suitMap));
	}
	
	@Test
	public void testCheckForFlushFalse() {
		suitMap.put('C', (long) 4);
		suitMap.put('S', (long) 1);
		assertFalse(pokerRanker.checkForFlush(suitMap));
	}
	
	@Test
	public void testForFullHouse() {
		valueMap.put(8, (long) 3);
		valueMap.put(7, (long) 2);
		assertTrue(pokerRanker.checkForFullHouse(valueMap));
	}
	
	@Test
	public void testForFullHouse2() {
		valueMap.put(8, (long) 2);
		valueMap.put(7, (long) 3);
		assertTrue(pokerRanker.checkForFullHouse(valueMap));
	}
	
	@Test
	public void testForFullHouseFalse() {
		valueMap.put(8, (long) 1);
		valueMap.put(7, (long) 3);
		assertFalse(pokerRanker.checkForFullHouse(valueMap));
	}
	
	@Test
	public void testForFourOfAKind() {
		valueMap.put(8, (long) 4);
		valueMap.put(9, (long) 1);		
		assertTrue(pokerRanker.checkForFourOfAKind(valueMap));
	}
	
	@Test
	public void testForFourOfAKind2() {
		valueMap.put(8, (long) 1);
		valueMap.put(9, (long) 4);		
		assertTrue(pokerRanker.checkForFourOfAKind(valueMap));
	}
	
	@Test
	public void testForFourOfAKindFail() {
		valueMap.put(8, (long) 4);
		assertFalse(pokerRanker.checkForFourOfAKind(valueMap));
	}
	
	@Test
	public void testForThreeOfAKind() {
		valueMap.put(8, (long) 3);
		valueMap.put(9, (long) 1);
		valueMap.put(10, (long) 1);
		assertTrue(pokerRanker.checkForThreeOfAKind(valueMap));
	}
	
	@Test
	public void testForThreeOfAKind2() {
		valueMap.put(8, (long) 1);
		valueMap.put(9, (long) 1);
		valueMap.put(10, (long) 3);
		assertTrue(pokerRanker.checkForThreeOfAKind(valueMap));
	}
	
	@Test
	public void testForThreeOfAKindFail() {
		valueMap.put(9, (long) 1);
		valueMap.put(10, (long) 3);
		assertFalse(pokerRanker.checkForThreeOfAKind(valueMap));
	}
	
	@Test
	public void testForTwoPair() {
		valueMap.put(8, (long) 2);
		valueMap.put(9, (long) 2);
		valueMap.put(10, (long) 1);
		assertTrue(pokerRanker.checkForTwoPair(valueMap));
	}
	
	@Test
	public void testForTwoPair2() {
		valueMap.put(8, (long) 1);
		valueMap.put(9, (long) 2);
		valueMap.put(10, (long) 2);
		assertTrue(pokerRanker.checkForTwoPair(valueMap));
	}
	
	@Test
	public void testForTwoPairFail() {
		valueMap.put(8, (long) 1);
		valueMap.put(9, (long) 2);
		valueMap.put(10, (long) 2);
		valueMap.put(11, (long) 1);
		assertFalse(pokerRanker.checkForTwoPair(valueMap));
	}
	
	@Test
	public void testCheckForPair() {
		valueMap.put(2, (long) 2);
		valueMap.put(4, (long) 1);
		valueMap.put(7, (long) 1);
		valueMap.put(13, (long) 1);
		assertTrue(pokerRanker.checkForPair(valueMap));
	}
	
	@Test
	public void testCheckForPair2() {
		valueMap.put(2, (long) 1);
		valueMap.put(4, (long) 1);
		valueMap.put(7, (long) 1);
		valueMap.put(13, (long) 2);
		assertTrue(pokerRanker.checkForPair(valueMap));
	}
	
	@Test
	public void testCheckForPairFalse() {
		valueMap.put(2, (long) 3);
		valueMap.put(4, (long) 1);
		valueMap.put(7, (long) 1);
		valueMap.put(13, (long) 1);
		assertFalse(pokerRanker.checkForPair(valueMap));
	}
	
	@Test
	public void testCheckForPairFalse2() {
		valueMap.put(2, (long) 2);
		valueMap.put(4, (long) 1);
		valueMap.put(7, (long) 1);
		valueMap.put(10, (long) 1);
		valueMap.put(13, (long) 1);
		assertFalse(pokerRanker.checkForPair(valueMap));
	}
	
	@Test
	public void testCheckForPairFalse3() {
		valueMap.put(2, (long) 2);
		valueMap.put(4, (long) 1);
		valueMap.put(7, (long) 1);
		assertFalse(pokerRanker.checkForPair(valueMap));
	}
}
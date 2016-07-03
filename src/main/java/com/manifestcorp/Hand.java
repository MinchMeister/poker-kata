package com.manifestcorp;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Hand {
	//TODO hashMap of str/int handRank
	
	//TODO make it a set or sorted set
	private List<Card> cardHand;
	private HandRanker handRanker;
	private int handRank;
	private String handRankTitle = "durp";
	
	public Hand() {
		cardHand = new ArrayList<Card>();
		handRanker = new HandRanker();
	}
	
	public void rankHand(){
		Map<Integer, Long> valueMap = cardHand.stream().collect(groupingBy(Card::getValue, counting()));
		Map<Character, Long> suitMap = cardHand.stream().collect(groupingBy(Card::getSuit, counting()));
		System.out.println(valueMap);
		
		/**
		SortedMap<Integer, Long> sortedValueMap = new SortedMap<Integer, Long>(
				new Comparator<Integer>() {
					@Override
					public int compare(Integer a, Integer b) {
						return a.compareTo(b);
					}
				});
		
		sortedValueMap.putAll(valueMap);
		
		System.out.println(sortedValueMap);
		//System.out.println(sortedValueMap);
		*/
		handRank = handRanker.findRank(valueMap, suitMap);
	}

	@Override
	public String toString() {
		StringBuilder handContains = new StringBuilder();
		for (Card card : cardHand){handContains.append(card.toString() + " ");}
		return handContains.toString();
	}
	
	public void addCard(Deck deck, int i) {
		cardHand.add(deck.getCard(i));
	}
	
	public int getHandRank() {return handRank;}
	
	public String getHandRankTitle() {return handRankTitle;}
	
	public Card getCard(int i) {return cardHand.get(i);}
}
package com.manifestcorp;

import java.util.Map;

public class HandRanker {
	
	public int findRank(Map<Integer, Long> valueMap, Map<Character, Long> suitMap) {
		if(valueMap.size() < 5) {
			
		}
		
		if(valueMap.size() == 5) {
		}
		return 0;
	}

	public boolean checkForPair(Map<Integer, Long> valueMap) {
		return valueMap.containsValue((long) 2) && valueMap.size() == 4;
	}
	
	public boolean checkForThreeOfAKind(Map<Integer, Long> valueMap) {
		return valueMap.containsValue((long) 3) && valueMap.size() == 3;
	}
	
	public boolean checkForFourOfAKind(Map<Integer, Long> valueMap) {
		return valueMap.containsValue((long) 4) && valueMap.size() == 2; 
	}
	
	public boolean checkForTwoPair(Map<Integer, Long> valueMap) {
		return valueMap.containsValue((long) 2) && valueMap.size() == 3;
	}
	
	public boolean checkForFullHouse(Map<Integer, Long> valueMap) {
		return valueMap.containsValue((long) 2) && valueMap.containsValue((long) 3) && valueMap.size() == 2;
	}
	//TODO    orderedMap
	public boolean checkForStraight(Map<Integer, Long> valueMap) {
		return valueMap.size() == 5 && valueMap.get(0)+4 == valueMap.get(4);
	}

	public boolean checkForFlush(Map<Character, Long> suitMap) {
		return suitMap.containsValue((long) 5) && suitMap.size() == 1;
	}
	
	public boolean checkForRoyalFlush(Map<Integer, Long> valueMap) {
		return valueMap.containsValue((long) 14);
	}
}
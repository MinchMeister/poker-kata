package com.manifestcorp;

public class PokerKata {
	
	private Deck deck;
	private Hand playerOne;
	private Hand playerTwo;
	
	public PokerKata() {
		deck = new Deck();
		playerOne = new Hand();
		playerTwo = new Hand();
	}
	
	public void start() {
		System.out.println(deck.toString());
		deck.shuffle();
		System.out.println(deck.toString());
		dealCards();
		playerOne.rankHand();
		playerTwo.rankHand();
		System.out.println("Player One: " + playerOne.toString() + " " + playerOne.getHandRankTitle() + " " + playerOne.getHandRank());
		System.out.println("Player Two: " + playerTwo.toString() + " " + playerTwo.getHandRankTitle());
		declareWinner();
	}
	//TODO TIE BREAKER
	public void declareWinner() {
		int p1Rank = playerOne.getHandRank();
		int p2Rank = playerTwo.getHandRank();
		
		if (p1Rank > p2Rank) {
			System.out.println("Player One Wins: " + playerOne.getHandRankTitle());
		} else if (p1Rank < p2Rank) {
			System.out.println("Player Two Wins: " + playerTwo.getHandRankTitle());
		} else System.out.println("Unable to rank yet");
	}
	
	public void dealCards() {
		for (int i = 0; i < 9; i++) {
			playerOne.addCard(deck, i);
			i++;
			playerTwo.addCard(deck, i);
		}
	}
}

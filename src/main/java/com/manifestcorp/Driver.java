package com.manifestcorp;

public class Driver {
	
	public static void main(String[] args) {
		PokerKata game = new PokerKata();
		game.start();
		System.out.println("game ended");
	}
}

//COMMENT HERE
//TODO re-add collections.sort(cardHand)
//cards must implement comparable.
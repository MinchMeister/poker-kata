package com.manifestcorp;

public class Card {
	
	private int value;
	private char suit;
	
	public Card(int value, char suit) {
		this.value = value;
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.value) + String.valueOf(this.suit);
	}
	
	public int getValue() {return value;}
	
	public char getSuit() {return suit;}
}
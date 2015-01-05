package com.copac.cardgame;

import java.util.ArrayList;
import java.util.Collections;

import com.copac.cardgame.exception.DeckEmptyException;


public class Deck {
	public ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card drawCard() throws DeckEmptyException {
		if(cards.isEmpty()) {
			throw new DeckEmptyException();
		}
		Card c = cards.get(0);
		cards.remove(0);
		return c;
	}
	
	public Integer remainingCards() {
		return cards.size();
	}
	
	public Boolean notEmpty() {
		return (cards.size() > 0);
	}
	
	public String toString() {
		StringBuilder tmp = new StringBuilder();
		int count = 1;
		tmp.append("Deck size: " + cards.size() + "\n");
		for(Card c : cards) {
			tmp.append("Card #" + count++ + " - " + c.toString() + "\n");
		}
		return tmp.toString();
	}
}

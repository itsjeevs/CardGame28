package cards;

import java.util.*;

import javax.print.attribute.HashAttributeSet;

public class Deck implements Iterator{
	protected ArrayList myCardList;
	protected int myIndex;
	
	
	public Deck(){
		myCardList = new ArrayList();
	
		for(int suit = ICard.SPADES; suit <= ICard.CLUBS; suit++){
			for (int rank = 0; rank <8; rank++){
				myCardList.add(new Card(suit,rank));
			}
		}
		shuffle();
	}
	
	protected void shuffle(){
		Collections.shuffle(myCardList);
		myIndex = 0;
	}

	public boolean hasNext() {
		return myIndex < myCardList.size();
	}

	public Object next() {
		ICard card = (ICard) myCardList.get(myIndex);
		myIndex++;
		return card;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}





class Card implements ICard{
	
	private final int mySuit;     
	private final int myRank;
	private final int myvalue;


	private static final String[] suitStrings = {
		"spades", "hearts", "diamonds", "clubs"	
	};
	
	private String cardDesc;
	
	private static final String[] rankStrings = {
		"jack","nine","ace","ten","king","queen","eight","seven"	
	};

	
	
	
	public Card(int suit, int rank){
		Map<String, Integer> valueMap = new HashMap<String, Integer>();
		valueMap.put(rankStrings[0], 3);
		valueMap.put(rankStrings[1], 2);
		valueMap.put(rankStrings[2], 1);
		valueMap.put(rankStrings[3], 1);
		valueMap.put(rankStrings[4], 0);
		valueMap.put(rankStrings[5], 0);
		valueMap.put(rankStrings[6], 0);
		valueMap.put(rankStrings[7], 0);
		
		mySuit = suit;
		myRank = rank;
		myvalue = valueMap.get((rank));
		
		cardDesc = rankStrings[getRank()]+" of "+
	             suitStrings[getSuit()];
	}

	public int getMyvalue() {
		return myvalue;
	}
	
	public int getSuit() {
		return mySuit;
	}
	
	public int getRank() {
		return myRank;
	}
	public String toString(){
		return cardDesc;
	}
	
	public int compareTo(Object o) {
		ICard other = (ICard) o;
		int rdiff = getRank() - other.getRank();
		if (rdiff == 0) {
			return getSuit() - other.getSuit();
		}
		else {
			return rdiff;
		}
	}
	
	public boolean equals(Object o){
	    return compareTo(o) == 0;
	}
	
}
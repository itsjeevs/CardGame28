package cards;

class Card implements ICard{
	
	private final int mySuit;     
	private final int myRank;
	
	private static final String[] suitStrings = {
		"spades", "hearts", "diamonds", "clubs"	
	};
	
	private String cardDesc;
	
//	private static final String[] rankStrings = {
//		"dummy","ace","two","three","four","five",
//		"six","seven","eight","nine","ten",
//		"jack","queen","king"	
//	};
	private static final String[] rankStrings = {
		"jack","nine","ace","ten","king","queen","eight","seven"	
	};

	
	public Card(int suit, int rank){
		mySuit = suit;
		myRank = rank;
		cardDesc = rankStrings[getRank()]+" of "+
	             suitStrings[getSuit()];
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
package cards;

public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deck aDeck = new Deck();
		Deck backupDeck = aDeck;
		
		while(aDeck.hasNext()){
			Card card = (Card) aDeck.next();
			System.out.println(card.toString());
		}
		
		

	}

}

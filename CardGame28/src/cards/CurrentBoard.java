package cards;

import java.util.List;

public class CurrentBoard {
	private List<Card> cardsPlayed;
	Player currentHolder;
	int totalPoints;
	
	
	public Player getCurrentHolder() {
		return currentHolder;
	}
	public void setCurrentHolder(Player currentHolder) {
		this.currentHolder = currentHolder;
	}

	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	
	public CurrentBoard(Player currentHolder, boolean wasCut, int totalPoints) {
		this.currentHolder = currentHolder;
		this.totalPoints = totalPoints;
	}
	
	public CurrentBoard() {
		this.currentHolder = null;
		this.totalPoints = 0;
	}
	public List<Card> getCardsPlayed() {
		return cardsPlayed;
	}
	
	public int getNumPlaysDone(){
		return cardsPlayed.size();
	}
	
	public void setCardsPlayed(List<Card> cardsPlayed) {
		this.cardsPlayed = cardsPlayed;
	}
	
	public void addCardToBoard(Card card){
		this.cardsPlayed.add(card);
	}
	
	public int getRunningSuite(){
		return cardsPlayed.get(0).getSuit();
	}
}

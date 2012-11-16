package cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

	public Player(String name, int points) {
		super();
		this.name = name;
		this.points = points;
		myHand = new Hand();
	}
	
	private String name;
	private Hand myHand;
	private int points;
	private Team team;
	private boolean isAI;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hand getMyHand() {
		return myHand;
	}

	public void setMyHand(Hand myHand) {
		this.myHand = myHand;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public boolean isMyTurn(PlayerTurn playerTurn){
		if (this == playerTurn.getCurrentPlayer()){
			return true;
		}
		else{
			return false;
		}
	}
	

	public void printPlayer() {
		System.out.println("\n\n");
		System.out.println(this.toString());
		System.out.println("******************");

		Hand hand = this.getMyHand();
		List<Card> cards = hand.getMyCards();
			for(Card card:cards){
				System.out.println(card.toString());
			}
	}

	public boolean getIsAI() {
		return isAI;
	}

	public void setIsAI(boolean isAI) {
		this.isAI = isAI;
	}
	
	public int getTotalPointsinHand(List<Card> cardList){
		int totalPoints =0;
		for (Card card:cardList){
			totalPoints = totalPoints + card.getMyvalue();
		}
		return totalPoints;
	}
	
	
	
	
//	public Card aiPlay(CurrentBoard board, GameStatus status){
	
	public TrumpCandidate aiPlayBid() {
		Map<Integer,Integer> sortedCards = new HashMap<Integer, Integer>();
		for(Card card: this.getMyHand().getMyCards()){
			if(sortedCards.containsKey(card.getSuit())){
				int count = sortedCards.get(card.getSuit());
				sortedCards.put(card.getSuit(), count+1);
			}
			else{
				sortedCards.put(card.getSuit(), 0);
			}
		}
		TrumpCandidate trumpable = calculateTrumpable();
		return trumpable;
	}
	
	private TrumpCandidate calculateTrumpable() {
		
		return null;
	}
}


class TrumpCandidate{
	Card card;
	int bid;
	
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public TrumpCandidate(Card card, int bid) {
		super();
		this.card = card;
		this.bid = bid;
	}
}

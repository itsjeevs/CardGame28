package cards;

import java.util.List;

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
}

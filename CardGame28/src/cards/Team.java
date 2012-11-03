package cards;

import java.util.ArrayList;

public class Team {

	private String teamName;
	
	private int totalPoints;
	
	private ArrayList<Player> players;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	
	public Team addPlayer(Player p) {
		
		if(this.players.size() < 2) {
			this.players.add(p);
		} else {
			//Need to throw an exception
		}
		return this;
	}
	
	public int getTotalPoints(ArrayList<Card> ourCards) {
		
		int total =0;
		for(Card c: ourCards) {
			total += c.getMyvalue();
		}
		
		return total;
	}
	
}

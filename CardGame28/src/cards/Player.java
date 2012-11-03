package cards;

public class Player {

	public Player(String name, Hand myHand, int points, Team team) {
		super();
		this.name = name;
		this.myHand = myHand;
		this.points = points;
		this.team = team;
	}

	private String name;
	
	private Hand myHand;
	
	private int points;
	
	private Team team;

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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
}

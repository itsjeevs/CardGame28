package cards;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deck aDeck = new Deck();
		
		List<Team> teamList = new ArrayList<Team>(); 
		Team team1 = new Team("Team1", 0);
		Team team2 = new Team("Team2", 0);
		
		Game game = new Game();
		
		
		for(int i=1; i<=4;i++){
			String player= "Player"+ i;
			Player aPlayer = new Player(player, 0);
			
			if(i%2==0){
				aPlayer.setTeam(team1);
			}
			else{
				aPlayer.setTeam(team2);
			}
			game.joinGame(aPlayer);
		}
		
		game.startGame();
		
		LinkedList<Player> players = (LinkedList<Player> ) game.getPlayersInTheGame();
		for(Player player : players){
			player.printPlayer();
		}
		
	}

}

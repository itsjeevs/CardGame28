package cards;

import java.util.LinkedList;
import java.util.Queue;

public class Game {

	private Queue<Player> playersInTheGame;
	
	public Game(String pName) {
		playersInTheGame = new LinkedList<Player>();
		Player p = new Player(pName,0);
		playersInTheGame.add(p);
	}
	
	public Game joinGame(String pName) {
		if(playersInTheGame.size()<4) {
			playersInTheGame.add(new Player(pName,0));
			return this;
		} else {
			return new Game(pName);
		}
	}
	
	public void startGame() {
		if(playersInTheGame.size()<4) {
			return;
		}
		
	}
}

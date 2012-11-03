package cards;

import java.util.LinkedList;
import java.util.Queue;

public class Game {

	private Queue<Player> playersInTheGame;
	Trump trump = new Trump();
	PlayerTurn playerTurn = new PlayerTurn();
	
	public Game(String pName) {
		playersInTheGame = new LinkedList<Player>();
		Player p = new Player(pName,0);
		playersInTheGame.add(p);
	}
	
	public Game(Player player) {
		playersInTheGame = new LinkedList<Player>();
		playersInTheGame.add(player);
	}
	
	
	public Game joinGame(String pName) {
		if(playersInTheGame.size()<=4) {
			playersInTheGame.add(new Player(pName,0));
			return this;
		} else {
			return new Game(pName);
		}
	}
	
	public Game joinGame(Player player) {
		if(playersInTheGame.size()<=4) {
			playersInTheGame.add(player);
			return this;
		} else {
			return new Game(player);
		}
	}
	
	
	public void startGame() {
		if(this.numPlayersInGame()<4) {
			return;
		}
		else{
			this.initiateGame();
		}
	}
	
	private void initiateGame() {
		
		//generate a new deck. 
		Deck deck = new Deck();
		
		Player player = playersInTheGame.remove();
		
		//Initiate a phase 1. Give 4 cards to each player. 
		for(int i=0;i<16;i++){
			Hand hand = new Hand();
			for(int j =0; j<4;j++){
				Card card = (Card) deck.next();
				hand.addCard(card);
			}
			player.setMyHand(hand);
			
		}
		
		//so that the first player in the queue now- is the one next to player1. 
		player = playersInTheGame.remove();
		playersInTheGame.add(player);
		
		
		for(Player p:playersInTheGame){
			playerTurn.setCurrentPlayer(p);
			while(true){
				if(trump.getBidOwner().equals(p) && trump.getCurrentHightestBid()>=14){
					continue;
				}
			}
		}
		
	}
	
	

	public int numPlayersInGame(){
		return playersInTheGame.size();
	}
	
	

}


class PlayerTurn{
	public static Player currentPlayer ;

	public static Player getCurrentPlayer() {
		return currentPlayer;
	}

	public static void setCurrentPlayer(Player currentPlayer) {
		PlayerTurn.currentPlayer = currentPlayer;
	}
	
	
}
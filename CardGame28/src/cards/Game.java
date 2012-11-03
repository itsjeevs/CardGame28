package cards;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {

	private Queue<Player> playersInTheGame;
	Trump trump ;
	PlayerTurn playerTurn ;
	
	public Game(){
		playersInTheGame = new LinkedList<Player>();
		trump = new Trump();
		playerTurn = new PlayerTurn();
	}
	
	
	public Game(Player player) {
		trump = new Trump();
		playerTurn = new PlayerTurn();
		
		playersInTheGame = new LinkedList<Player>();
		playersInTheGame.add(player);
	}
	
	
	public int joinGame(Player player) {
		if(playersInTheGame.size()<=4) {
			playersInTheGame.add(player);
		} 
			return numPlayersInGame();
	}
	

	
	public void startGame() {
		
		if(this.numPlayersInGame() != 4){
			return;
		}
		
		//generate a new deck. 
		Deck deck = new Deck();
		
		Player player;
		
		//Initiate Deal phase 1. Give 4 cards to each player. 
		for(int i=0;i<4;i++){
			player = playersInTheGame.remove();
			Hand hand = new Hand();
			for(int j =0; j<4;j++){
				Card card = (Card) deck.next();
				hand.addCard(card);
			}
			player.setMyHand(hand);
			playersInTheGame.add(player);			
		}
		
/*
		//so that the first player in the queue now- is the one next to player1. 
		player = playersInTheGame.remove();
		playersInTheGame.add(player);
		
		
		bid(playersInTheGame);
		
		//Initiate Deal phase 1. Give 4 cards to each player. 
		for(int i=0;i<16;i++){
			Hand hand = new Hand();
			for(int j =0; j<4;j++){
				Card card = (Card) deck.next();
				hand.addCard(card);
			}
			player.setMyHand(hand);
			
		}		
		
		for(Player p:playersInTheGame){
			playerTurn.setCurrentPlayer(p);
			while(true){
				break;
			}
		}
		*/
	}
	

	private void bid(Queue<Player> playersInTheGame) {

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


	public Queue<Player> getPlayersInTheGame() {
		return playersInTheGame;
	}


	public void setPlayersInTheGame(Queue<Player> playersInTheGame) {
		this.playersInTheGame = playersInTheGame;
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
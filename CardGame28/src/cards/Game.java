package cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {

	private Queue<Player> playersInTheGame;
	Trump trump ;
	PlayerTurn playerTurn ;
	Deck deck;
	
	
	public Game(){
		playersInTheGame = new LinkedList<Player>();
		trump = new Trump();
		playerTurn = new PlayerTurn();
		deck= new Deck() ;
	}
	
	
	public Game(Player player) {
		trump = new Trump();
		playerTurn = new PlayerTurn();
		
		playersInTheGame = new LinkedList<Player>();
		playersInTheGame.add(player);
		deck= new Deck() ;
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
		
		Player player;
		
		//Initiate Deal phase 1. Give 4 cards to each player. 
		for(int i=0;i<4;i++){
			player = playersInTheGame.remove();
			for(int j =0; j<4;j++){
				Card card = (Card) deck.next();
				player.getMyHand().addCard(card);
			}
			playersInTheGame.add(player);			
		}
		

		//so that the first player in the queue now- is the one next to player1. 
		player = playersInTheGame.remove();
		playersInTheGame.add(player);
		
		
		
		
		//Initiate Deal phase 1. Give 4 cards to each player. 
		for(int i=0;i<4;i++){
			Hand hand = new Hand();
			for(int j =0; j<4;j++){
				Card card = (Card) deck.next();
				hand.addCard(card);
			}
			player.setMyHand(hand);
			
		}		
/*		
		for(Player p:playersInTheGame){
			playerTurn.setCurrentPlayer(p);
			while(true){
				break;
			}
		}
		*/
	}  
	

	public void bid(Player p, int inputTrumpValue) {

		if (inputTrumpValue == 100) {
			System.out.println(p.getName() + " folded");
		} else {
			trump.setBidOwner(p);
			trump.setCurrentHightestBid(inputTrumpValue);
			System.out.println("Bid of " + trump.getCurrentHightestBid() + " by " + trump.getBidOwner());
			
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

	
	public Trump getTrump() {
		return trump;
	}


	public void setTrump(Trump trump) {
		this.trump = trump;
	}
	

	public PlayerTurn getPlayerTurn() {
		return playerTurn;
	}


	public void setPlayerTurn(PlayerTurn playerTurn) {
		this.playerTurn = playerTurn;
	}


	public boolean isValidBid(int inputTrumpValue, boolean firstRoundDone){
		
		//during first round= mandatory bid
		if (!firstRoundDone) {
			if (inputTrumpValue >= 14 && inputTrumpValue <= 28)
				return true;
			else
				return false;
		} else{
			if (inputTrumpValue > this.getTrump().getCurrentHightestBid() )
				return true;
			else
				return false;
		}
	}


	
}


class PlayerTurn{
	public  Player currentPlayer ;

	public  Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		currentPlayer = currentPlayer;
	}
	
	
}
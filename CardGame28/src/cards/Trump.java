package cards;

public class Trump {
	int currentHightestBid =0;
	Player bidOwner;
	
	
	
	public int getCurrentHightestBid() {
		return currentHightestBid;
	}
	
	public void setCurrentHightestBid(int currentHightestBid) {
		if(this.currentHightestBid<currentHightestBid){
			this.currentHightestBid = currentHightestBid;
		}
		else{
			return;
		}
	}
	
	public Player getBidOwner() {
		return bidOwner;
	}
	public void setBidOwner(Player bitOwner) {
		this.bidOwner = bitOwner;
	}
	public Trump(int currentHightestBid, Player bitOwner) {
		super();
		this.currentHightestBid = currentHightestBid;
		this.bidOwner = bitOwner;
	}
	
	
	public Trump() {
		this.currentHightestBid = 0;
		this.bidOwner = new Player("RandomPlayerGeneratedAtTrump", 0);
	}
	
	
	
	
	
}

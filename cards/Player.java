package cards;

import java.util.List;

public class Player {

    String name;
    int points;
    Team team;
    List<Card> hand;
    boolean trumpSetter;

    public Player(String name) {
        super();
        this.name = name;
        this.points = 0;
        this.team = null;
        this.hand = null;
        this.trumpSetter = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public boolean isTrumpSetter() {
        return trumpSetter;
    }

    public void setTrumpSetter(boolean trumpSetter) {
        this.trumpSetter = trumpSetter;
    }
    
    public boolean addCard(Card card) {
        if (card != null) {
            hand.add(card);
            return true;
        } else return false;
    }

    public boolean removeCard(Card card) {
        if (hand.contains(card)) {
            hand.remove(card);
            return true;
        } else return false;
    }

}

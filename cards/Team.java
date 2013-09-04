package cards;

import java.util.List;

public class Team {
    int points;
    String name;
    List<Player> players;

    public Team(int points, String name, List<Player> players) {
        super();
        this.points = points;
        this.name = name;
        this.players = players;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

}

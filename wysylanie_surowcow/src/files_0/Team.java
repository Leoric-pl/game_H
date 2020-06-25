package files_0;

import java.util.ArrayList;
import java.util.List;

class Team {
    List<Player> players = new ArrayList<>();
    String TeamName;

    Team(String TeamName) {
        this.TeamName = TeamName;
    }

    void addPlayer(String PlayerName, int PlayerID) {
        players.add(new Player(PlayerName, PlayerID));
    }

    Player getPlayer(int PlayerIndex) {
        return players.get(PlayerIndex);
    }

    void removePlayer(int playerIndex) {
        players.remove(getPlayer(playerIndex));
    }

}

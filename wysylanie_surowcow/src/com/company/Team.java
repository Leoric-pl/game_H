package com.company;

import java.util.ArrayList;
import java.util.List;

class Team {
    static List<Player> players = new ArrayList<>();
    String TeamName;

    Team(String TeamName) {
        this.TeamName = TeamName;
    }

    void addplayer(String PlayerName, int PlayerID) {
        players.add(new Player(PlayerName, PlayerID));
    }

    Player getPlayer(int PlayerIndex) {
        return players.get(PlayerIndex);
    }
}

package com.company;

public class Ajustes {
    Player[] playersList;
    private int numPlayers;
    private int level;

    public Ajustes(Player[] playersList) {
        this.playersList = playersList;
        numPlayers = 1;
        level = 1;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

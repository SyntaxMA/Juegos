package com.company;

public class AjustesDaus {
    Player[] playersList;
    private int level;

    public AjustesDaus(Player[] playersList) {
        this.playersList = playersList;
        level = 1;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}


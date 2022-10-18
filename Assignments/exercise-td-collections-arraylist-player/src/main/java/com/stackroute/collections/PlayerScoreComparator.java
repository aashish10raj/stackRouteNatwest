package com.stackroute.collections;

import java.util.Comparator;

public class PlayerScoreComparator implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if (p1.getPlayerScore() == p2.getPlayerScore()){
            if(p1.getPlayerId()>p2.getPlayerId()){
                return 1;
            }
            else
                return -1;
        }

        else if (p1.getPlayerScore() > p2.getPlayerScore())
            return -1;
        else
            return 1;
    }




}

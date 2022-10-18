package com.stackroute.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerListService {

    ArrayList<Player> list=new ArrayList<>();

    public List<Player> getPlayerListSortedByScoreInDescendingOrder(){
        Collections.sort(list, new PlayerScoreComparator());
        return list;
    }

    public  List<Player> getPlayerListSortedByNameIgnoringCaseInAscendingOrder(){
            Collections.sort(list, new PlayerNameComparator());
            return list;
    }

    public void addPlayersToList(Player player){
        list.add(player);
    }

    public List<Player> getPlayerListGreaterThanFiftySortedByScoreInDescendingOrder(){
        ArrayList<Player> p = new ArrayList<Player>();
     for(Player player:list){
         if(player.getPlayerScore()>50){
             p.add(player);
         }
     }
     Collections.sort(p, new PlayerScoreComparator());

        return p;
    }

    public List<Player> getPlayerListPlayedInSameMatchSortedByNameInAscendingOrder(String event){
        ArrayList<Player> p = new ArrayList<Player>();
        for(Player player:list){
            if(player.getPlayerMatch()==event){
                p.add(player);
            }
        }
        Collections.sort(p, new PlayerNameComparator());

        return p;
    }
    public List<Player> getPlayerList(){
    return list;
    }
}


package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    private String name;

    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(team != null && !(league.contains(team))){
            league.add(team);
            return true;
        }
        System.out.println("Team is either null or already in the league");
        return false;
    }

    public void leagueTable(){
        Collections.sort(this.league);
        System.out.println("\nTeam Standings:");
        System.out.println("Ranking \tPoints \t\tTeam");
        int i = 1;
        for (T team: league) {
            System.out.println(i + "\t\t\t" + team.ranking() + "\t\t\t" + team.getName());
            i++;
        }
    }

    public String getName() {
        return name;
    }
}

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team<FootballPlayer> crows = new Team<>("Adelaide Crows");
        crows.addPlayer(joe);
        //crows.addPlayer(pat);
        //crows.addPlayer(beckham);
       // System.out.println(crows.numPlayers());
        Team<BaseballPlayer> cubs = new Team<>("Chicago Cubs");
        cubs.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This will work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> hawthron = new Team<>("Hawthorn");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");

        hawthron.matchResult(freemantle,1,0);
        hawthron.matchResult(crows,3,8);

        crows.matchResult(freemantle, 2, 1);

        System.out.println("Rankings");
        System.out.println(crows.getName() + " : " + crows.ranking());
        System.out.println(cubs.getName() + " : " + cubs.ranking());
        System.out.println(hawthron.getName() + " : " + hawthron.ranking());
        System.out.println(freemantle.getName() + " : " + freemantle.ranking());

    }

}

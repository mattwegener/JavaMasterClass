package com.company;

public class Main {

    public static void main(String[] args) {
        League<SoccerTeam> bundes = new League<>("Deutsches Bundesliga");
        SoccerTeam schalke = new SoccerTeam("Schalke 04");
        SoccerTeam bayern = new SoccerTeam("Bayern");
        SoccerTeam koln = new SoccerTeam("FC Koln");

        bundes.addTeam(schalke);
        bundes.addTeam(bayern);
        bundes.addTeam(koln);

        schalke.matchResult(bayern,3,2);
        schalke.matchResult(koln,5,1);
        bayern.matchResult(koln,6,3);

        bundes.leagueTable();
    }
}

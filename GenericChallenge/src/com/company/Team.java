package com.company;

public abstract class Team<T> implements Comparable<Team<T>> {
    private String name;
    private int wins;
    private int lost;
    private int tied;
    private int played;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.lost = 0;
        this.tied = 0;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String msg;
        if(ourScore > theirScore){
            wins++;
            msg = " beat ";
        }
        else if(ourScore == theirScore){
            tied++;
            msg = " drew with ";
        }
        else{
            lost++;
            msg = " lost to ";
        }

        played++;

        if(opponent != null){
            System.out.println(this.getName() + msg + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int ranking(){
        return (wins * 2 + tied);
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }
}

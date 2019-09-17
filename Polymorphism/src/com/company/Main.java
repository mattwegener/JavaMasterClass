package com.company;


class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Empirals try to take over universe";
    }
}

class Forgetable extends Movie {
    public Forgetable(){
        super("Forgetable");
    }
    //no plot method
}


public class Main {

    public static void main(String[] args) {
        for(int i=1; i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");

        }
    }
    public static Movie randomMovie(){
        int randNumber = (int)(Math.random()*5)+1;
        System.out.println("Random Gen is " + randNumber);
        switch (randNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();

        }
        return null;

    }
}




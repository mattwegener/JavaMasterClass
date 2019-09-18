package com.company;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("Ace",3.13);
        Song song2 = new Song("Diamonds", 4.25);
        Song song3 = new Song("Baby",2.54);
        Song song4 = new Song("Papi", 0.2);

        Album shapes = new Album("shapes");
        shapes.addSong(song1);
        shapes.addSong(song2);

        Album people = new Album("people");
        people.addSong(song3);
        people.addSong(song4);

        shapes.trackList();
        people.trackList();

        Playlist playlist = new Playlist();

        playlist.addSong("Ace",shapes);
        playlist.addSong("Diamonds",shapes);
        playlist.addSong("Baby",people);
        playlist.addSong("Papi",people);

        playlist.play();
    }
}

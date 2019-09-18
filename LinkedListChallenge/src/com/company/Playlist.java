package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private static LinkedList<Song> playlist;
    private static Scanner scanner = new Scanner(System.in);
    public Playlist() {
        this.playlist = new LinkedList<Song>();
    }

    public static void addSong(String track, Album album){
        Song song = album.retrieveSong(track);
        if(song != null) {
            playlist.add(song);
            System.out.println(song.getTitle() + " Added to playlist");
        }
        else{
            System.out.println(track + " not found in " + album.getName());
        }
    }

    public static void printSongs(){
        ListIterator<Song> playlistIterator = playlist.listIterator();
        int i = 0;
        while(playlistIterator.hasNext()){
            Song song = playlistIterator.next();
            System.out.println(i + ". " + song.getTitle() + " " + song.getDuration());
            i++;
        }
    }
    private static void menu(){
        System.out.println("1. Quit");
        System.out.println("2. Skip forward");
        System.out.println("3. Skip backward");
        System.out.println("4. Replay song");
        System.out.println("5. List songs\n");

    }

    public static void play(){
        ListIterator<Song> playlistIterator = playlist.listIterator();
        boolean quit = false;
        boolean dir = true;
        while(!quit){
            menu();
            System.out.println("Select option:");
            int action = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");

            switch (action){
                case 1: //quit
                    quit = true;
                    break;
                case 2: //Skip forward
                    if(dir && playlistIterator.hasNext()){
                        System.out.println("Skipped forward. Now Playing: " + playlistIterator.next().getTitle());
                    }else if(!dir && playlistIterator.next() != null){
                        System.out.println("Skipped forward. Now Playing: " + playlistIterator.next().getTitle());
                        dir = true;
                    }else{
                        System.out.println("At end of the playlist");
                    }
                    break;

                case 3: //Skip backward
                    if(!dir && playlistIterator.hasPrevious()){
                        System.out.println("Skipped backward. Now Playing: " + playlistIterator.previous().getTitle());
                    }else if(dir && playlistIterator.previous() != null){
                        System.out.println("Skipped backward. Now Playing: " + playlistIterator.previous().getTitle());
                        dir = false;
                    }else{
                        System.out.println("At the beginning of the list");
                    }
                    break;

                case 4: //Replay
                    if(dir){
                        System.out.println("Replaying Song. Now Playing: " + playlistIterator.previous().getTitle());
                        dir = false;
                    }else{
                        System.out.println("Replaying Song. Now Playing: " + playlistIterator.next().getTitle());
                        dir = true;
                    }
                    break;

                case 5: //list songs
                    printSongs();
                    break;
            }
        }

    }
}

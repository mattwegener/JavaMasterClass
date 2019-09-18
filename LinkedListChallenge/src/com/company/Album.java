package com.company;

import java.util.ArrayList;

public class Album {
    private static ArrayList<Song> songs;
    private static String name;

    public Album(String name) {
        this.songs = new ArrayList<Song>();
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public static boolean addSong(Song song){
        String name = song.getTitle();
        if(!findSong(name)){
            songs.add(song);
            return true;
        }
        System.out.println("Song already is in the album");
        return false;
    }

    private static boolean findSong(String name){
        for(int i = 0; i< songs.size(); i++){
            if(songs.get(i).getTitle().equals(name)){
                return true;
            }
        }
        return false;
    }

    public static Song retrieveSong(String title){
        if(findSong(title)){
            for(int i = 0; i< songs.size(); i++) {
                if (songs.get(i).getTitle().equals(title)) {
                    return songs.get(i);
                }
            }
        }

        System.out.println(title + " not in album");
        return null;
    }

    public static void trackList(){
        for(int i = 0; i< songs.size(); i++){
            System.out.println((i+1) + ". " + songs.get(i).getTitle());
        }
    }

}

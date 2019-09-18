package com.company;

import java.util.ArrayList;

public class Player implements ISaveable{
    private double HP;
    private double MP;
    private String name;
    private String weapon;

    public Player( String name, String weapon) {
        this.HP = 100;
        this.MP = 100;
        this.name = name;
        this.weapon = weapon;
    }

    @Override
    public void load(ArrayList list) {
        this.HP = Double.parseDouble((String)list.get(0));
        this.MP = Double.parseDouble((String)list.get(1));
        this.name= (String)list.get(2);
        this.weapon = (String)list.get(3);

    }

    @Override
    public ArrayList save() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(Double.toString(HP));
        list.add(Double.toString(MP));
        list.add(name);
        list.add(weapon);
        return list;
    }

    @Override
    public String toString() {
        return "Player{" +
                "HP=" + HP +
                ", MP=" + MP +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

}

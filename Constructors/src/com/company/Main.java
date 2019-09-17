package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer matthew = new VipCustomer("Matthew");
        System.out.println("New vip " + matthew.getName() + " has email " + matthew.getEmail());

    }
}

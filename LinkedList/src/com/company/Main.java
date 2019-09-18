package com.company;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim",54.96);
        Customer anotherCustome = customer;
        anotherCustome.setBalance(12.18);

        System.out.println("Name" + customer.getName() +" blanace " + customer.getBalance());


    }
}

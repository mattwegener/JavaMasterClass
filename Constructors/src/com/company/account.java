package com.company;

public class account {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public account(){
        this("00000",0.0,"Default","Default","000-000-0000");
        System.out.println("Default constructor");
    }

    public account(String number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor with params called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdrawal(double amount){
        if(amount > balance) System.out.println("Insufficient funds, " + balance + " is available");
        else{
            balance -= amount;
            System.out.println("Withdrew: "+amount+" Remaining Balance: " +balance);
        }
    }

    public void deposit(double amount){
            balance += amount;
            System.out.println("Deposited: "+amount+" New Balance: " +balance);
    }
}


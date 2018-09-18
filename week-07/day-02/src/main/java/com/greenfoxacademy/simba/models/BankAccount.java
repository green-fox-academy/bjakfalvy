package com.greenfoxacademy.simba.models;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;

   public BankAccount(){

    }

    public BankAccount(String name, double balance, String animalType){
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
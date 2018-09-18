package com.greenfoxacademy.simba.models;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;

    public BankAccount(String name, double balance, String animalType, boolean isKing){
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
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

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }
}

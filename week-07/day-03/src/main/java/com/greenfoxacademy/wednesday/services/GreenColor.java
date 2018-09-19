package com.greenfoxacademy.wednesday.services;

import org.springframework.stereotype.Service;

public class GreenColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("This is green");
    }
}

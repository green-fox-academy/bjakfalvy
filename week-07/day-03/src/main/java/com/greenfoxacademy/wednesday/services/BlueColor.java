package com.greenfoxacademy.wednesday.services;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("This is blue");
    }
}

package com.greenfoxacademy.wednesday.services;

import org.springframework.stereotype.Service;

@Service
public class EmailValidatorService {
    public boolean validateEmail(String email){
        if (email.contains("@") && email.contains(".")){
            return true;
        } return false;
    }
}

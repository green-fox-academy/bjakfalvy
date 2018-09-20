package com.example.marioclub.services;

import com.example.marioclub.models.Mario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Character {
    private static List<Mario> marioList;

    public Character(){
        this.marioList = new ArrayList<>();
    }

    public static void register(String name) {
        marioList.add(new Mario(name));
    }

    public static Mario findMario(String name) {
        for (Mario listOfMarios : marioList) {
            if (listOfMarios.getName().equals(name)) {
                return listOfMarios;
            }
        }
        return null;
    }

    public static Mario login(String name) {
        if (findMario(name) == null) {
            register(name);
        }
        return findMario(name);
    }
}

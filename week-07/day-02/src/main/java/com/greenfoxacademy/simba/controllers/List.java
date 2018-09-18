package com.greenfoxacademy.simba.controllers;

import com.greenfoxacademy.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class List {

    @RequestMapping("/list")
    public String listOfAccounts(Model model){
        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount("Simon", 100, "mouse", false));
        list.add(new BankAccount("Simba", 2000, "lion", true));
        list.add(new BankAccount("Pumba", 20, "Warthog", false));
        list.add(new BankAccount("Zazu", 1000, "Hornbill", false));
        list.add(new BankAccount("Timon", 500, "Meerkat", false));
        model.addAttribute("accountList", list);
        return "list";
    }
}

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
        list.add(new BankAccount("Simon", 100, "mouse"));
        list.add(new BankAccount("Pumba", 20.00, "Warthog"));
        list.add(new BankAccount("Zazu", 1000.00, "Hornbill"));
        list.add(new BankAccount("Timon", 500.00, "Meerkat"));
        model.addAttribute("accountList", list);
        return "list";
    }
}

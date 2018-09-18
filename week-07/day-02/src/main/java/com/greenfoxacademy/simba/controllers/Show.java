package com.greenfoxacademy.simba.controllers;

import com.greenfoxacademy.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Show {

    BankAccount bankAccount;

    @RequestMapping("/show")
        public String bankAccount(Model model){
            model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
            return "index";
    }

    @RequestMapping("/balance")
    public String format(Model model){
        model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
        return "balance";
    }
}

package com.greenfoxacademy.simba.controllers;

import com.greenfoxacademy.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Show {

    @RequestMapping("/show")
        public String bankAccount(Model model){
            model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
            return "index";
    }

}

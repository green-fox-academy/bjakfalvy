package com.greenfoxacademy.wednesday.controllers;

import com.greenfoxacademy.wednesday.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Utilities {

    UtilityService utilityService;

    public Utilities(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String index() {
        return "index";
    }

    @RequestMapping("/useful/colored")
    public String coloredPage(Model model) {
        model.addAttribute("utility", utilityService.randomColor());
        return "colored";
    }


}

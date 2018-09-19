package com.greenfoxacademy.wednesday.controllers;
import com.greenfoxacademy.wednesday.services.EmailValidatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    EmailValidatorService emailValidatorService;

    public EmailController(EmailValidatorService emailValidatorService){
        this.emailValidatorService = emailValidatorService;
    }

    @RequestMapping("/useful/email")
    public String validator(Model model, @RequestParam("email") String email){
        model.addAttribute("email",email);
        model.addAttribute("valid", emailValidatorService.validateEmail(email));
        return "email";
    }
}

package com.greenfocaxademy.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
    @GetMapping("/greeter")
    @ResponseBody
    public Greeter greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null || title == null) {
            return new Greeter("Error");
        }
        return new Greeter(name, title);
    }

    static class Greeter {
        public String welcome_message;
        public String error;


        public Greeter(String name, String title) {
            welcome_message = "Oh, hi there " + name + ", my dear " + title;
        }

        public Greeter(String error) {
            this.error = error;
        }
    }
}

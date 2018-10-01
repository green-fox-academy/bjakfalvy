package com.greenfocaxademy.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Append append(@PathVariable String appendable) {
        if (appendable == null) return null;
        return new Append(appendable);
    }


    static class Append {
        public String append;

        public Append(String appendable) {
            append = appendable + "a";
        }
    }
}
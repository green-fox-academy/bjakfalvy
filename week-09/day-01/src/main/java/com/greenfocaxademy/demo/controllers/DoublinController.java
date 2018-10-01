package com.greenfocaxademy.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class DoublinController {

    @GetMapping("/doubling")
   @ResponseBody
   public DoubleInput doubling(@RequestParam(required = false) Integer input){
        if (input == null) {
            return new DoubleInput();
        }
        return new DoubleInput(input);
    }

    static class DoubleInput {
        public int received;
        public int result;
        public String error;

        public DoubleInput (int received){
            this.received = received;
            this.result = 2 * received;
        }

        public DoubleInput() {
            this.error= "Please provide an input!";
        }
    }
}

package com.greenfocaxademy.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class UntilController {

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Do dountil(@PathVariable String action, @RequestBody(required = false) Until input) {
        if (action.equals("sum") && input != null) {
            int sum = 0;
            for (int i = 0; i <= input.until; i++) {
                sum += i;
            }
            return new Do(sum);
        } else if (action.equals("factor") && input != null) {
            int factor = 1;
            for (int i = 1; i <= input.until; i++) {
                factor *= i;
            }
            return new Do(factor);
        }
        return new Do("Please provide a number");
    }


    static class Until {
        public int until;
    }

    static class Do {
        public int result;
        public String error;

        public Do(int result) {
            this.result = result;
        }

        public Do(String error) {
            this.error = error;
        }
    }
}

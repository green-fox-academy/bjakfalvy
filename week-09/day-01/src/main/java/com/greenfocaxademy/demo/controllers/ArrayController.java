package com.greenfocaxademy.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {

    @PostMapping("/arrays")
    @ResponseBody
    public Output calculator(@RequestBody Input input) {
        if (input != null && input.numbers != null && input.what != null){
            if (input.what.equals("sum")){
                int[] result = new int[1];
                for (int i = 0; i < input.numbers.length; i++) {
                    result[0] += input.numbers[i];
                }
                return new Output(result);
            } else if (input.what.equals("multiply")) {
                int[] result = new int[1];
                result [0] = 1;
                for (int i = 0; i < input.numbers.length; i++) {
                    result[0] *= input.numbers[i];
                }
                return new Output(result);
            } else if (input.what.equals("double")) {
                for (int i = 0; i < input.numbers.length; i++) {
                    input.numbers[i] *= 2;
                }
                return new Output(input.numbers);
            }
        }
        return new Output("Please provide what to do with the numbers!");
    }



    static class Input {
        public String what;
        public int[] numbers;
    }
        static class Output {
            public String error;
            public int[] result;

            public Output(String error) {
                this.error = error;
            }

            public Output(int[] result) {
                this.result = result;
            }
        }
}

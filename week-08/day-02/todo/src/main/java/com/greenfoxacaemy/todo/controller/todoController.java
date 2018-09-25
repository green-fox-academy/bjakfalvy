package com.greenfoxacaemy.todo.controller;

import com.greenfoxacaemy.todo.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class todoController {

    private TodoRepository todoRepository;

    public todoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping("/todo")
    public String list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

}

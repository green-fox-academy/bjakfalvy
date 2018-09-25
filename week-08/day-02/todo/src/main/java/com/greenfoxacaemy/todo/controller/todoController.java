package com.greenfoxacaemy.todo.controller;

import com.greenfoxacaemy.todo.models.Todo;
import com.greenfoxacaemy.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class todoController {

    private TodoRepository todoRepository;

    public todoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/todo", "/"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive) {
        boolean listActives = false;
        if (isActive != null && isActive.equals("true")) listActives = true;
        model.addAttribute("listActives", listActives);
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @GetMapping("/todo/add")
    public String get() {
        return "todoadd";
    }

    @PostMapping("/todo/add")
    public String post(String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/todo";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo";
    }
}

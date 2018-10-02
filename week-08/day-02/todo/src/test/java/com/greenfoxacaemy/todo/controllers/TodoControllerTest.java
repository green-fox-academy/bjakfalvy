package com.greenfoxacaemy.todo.controllers;

import com.greenfoxacaemy.todo.controller.TodoController;
import com.greenfoxacaemy.todo.repositories.TodoRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class TodoControllerTest {

    private TodoRepository mockTodoRepository;

    @Before
    public void before() {
        mockTodoRepository = mock(TodoRepository.class);
    }

    @Test
    public void post() {
        TodoController controller = new TodoController(mockTodoRepository);

        String result = controller.post("valami");

        assertEquals("redirect:/todo", result);
    }
}

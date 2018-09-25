package com.greenfoxacaemy.todo;

import com.greenfoxacaemy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}

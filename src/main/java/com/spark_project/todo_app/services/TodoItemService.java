package com.spark_project.todo_app.services;

import org.springframework.stereotype.Service;

import com.spark_project.todo_app.models.TodoItem;
import com.spark_project.todo_app.repositories.TodoItemRepository;

@Service
public class TodoItemService {
    private final TodoItemRepository todoItemRepository;

    public TodoItemService(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    public TodoItem saveTodoItem(TodoItem todoItem) {
        return todoItemRepository.save(todoItem);
    }

}

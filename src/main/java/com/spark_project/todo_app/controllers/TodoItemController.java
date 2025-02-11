package com.spark_project.todo_app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spark_project.todo_app.models.TodoItem;
import com.spark_project.todo_app.services.TodoItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/todos")
public class TodoItemController {
    private final TodoItemService todoItemService;

    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @PostMapping
    public TodoItem createTodoItem(@RequestBody TodoItem todoItem) {
        return todoItemService.saveTodoItem(todoItem);
    }

    @GetMapping
    public List<TodoItem> retrieveAllTodoItems() {
        return todoItemService.getAllTodoItems();
    }

}

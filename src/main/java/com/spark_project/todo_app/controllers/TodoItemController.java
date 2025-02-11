package com.spark_project.todo_app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spark_project.todo_app.models.TodoItem;
import com.spark_project.todo_app.services.TodoItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

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

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Long id) {
        todoItemService.deleteTodoItem(id);
    }

    @PutMapping("{id}/toggle")
    public TodoItem toggleTodoItemCompletion(@PathVariable Long id) {
        TodoItem updatedTodoItem = todoItemService.updateTodoItemState(id, false);
        return updatedTodoItem;
    }

}

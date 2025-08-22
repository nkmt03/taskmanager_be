package com.example.taskmanager_be.controller;


import com.example.taskmanager_be.model.Task;
import com.example.taskmanager_be.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*") // Cho phép Flutter gọi API
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // Tạo mới
    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.createTask(task);
    }

    // Xóa
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteTask(id);
        return "Deleted task with id " + id;
    }

    // Lấy tất cả
    @GetMapping
    public List<Task> getAll() {
        return service.getAllTasks();
    }

    // Lấy theo id
    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable Long id) {
        return service.getTaskById(id);
    }
}

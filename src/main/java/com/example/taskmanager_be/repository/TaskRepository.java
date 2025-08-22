package com.example.taskmanager_be.repository;


import com.example.taskmanager_be.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}


package com.example.demo.dto;

import java.time.LocalDateTime;

public class TaskDto {
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime completedAt;
}

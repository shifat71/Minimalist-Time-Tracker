package com.example.minimalisttimetracker.model

data class TaskCategory(
    val id: Long,
    val name: String,
    val tasks: List<Task>? =null,

)

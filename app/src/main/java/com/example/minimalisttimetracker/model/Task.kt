package com.example.minimalisttimetracker.model

import java.util.Date

data class Task(
    val id: Long,
    val name: String,
    val categoryId: Long? = null,
    val deadline: Date? = null,
    val createdAt: Date? = null,
    val duration: Long? = null,  // sin milliseconds
    val progress: Long? = null, // in milliseconds
    val isCompleted: Boolean = false
    )

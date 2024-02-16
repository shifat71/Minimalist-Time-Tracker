package com.example.minimalisttimetracker.data

import com.example.minimalisttimetracker.model.Task
import com.example.minimalisttimetracker.model.TaskCategory

object DataSource {

    val category1 = TaskCategory(
        1,
        "Mental Health",
    )
    val category2 = TaskCategory(
        2,
        "Sports",
    )
    val category3 = TaskCategory(
        3,
        "Entertainment",
    )
    val category4 = TaskCategory(
        4,
        "Study",
    )


    val categories = listOf<TaskCategory>(category1, category2, category3, category4)

    val task1 = Task(
        1,
        "Meditation",
        1
    )
    val task2 = Task(
        2,
        "Study Biology",
        4
    )
    val task3 = Task(
        3,
        "Study Physics",
        4
    )
    val task4 = Task(
        4,
        "Play Basketball",
        2
    )

    val task5 = Task(
        3,
        "Watch Movies",
    )

    val tasks = listOf<Task>(task1, task2, task3, task4, task5)


}
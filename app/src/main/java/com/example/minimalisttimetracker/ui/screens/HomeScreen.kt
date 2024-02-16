package com.example.minimalisttimetracker.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.minimalisttimetracker.data.DataSource
import com.example.minimalisttimetracker.model.TaskCategory

@Composable
fun HomeScreen(tasks: List<TaskCategory>) {
    LazyColumn {
        items(tasks) {
            Row {
                Text(
                    text = "${it.name}"
                )
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen(DataSource.categories);
}
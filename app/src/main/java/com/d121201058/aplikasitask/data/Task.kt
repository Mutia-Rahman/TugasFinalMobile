package com.d121201058.aplikasitask.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")

data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String,
    val category: String
)
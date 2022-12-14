package com.d121201058.aplikasitask.data

import androidx.lifecycle.LiveData
import com.d121201058.aplikasitask.data.Task
import com.d121201058.aplikasitask.data.TaskDao

class TaskRepository(private val taskDao: TaskDao) {

    val readAllData: LiveData<List<Task>> = taskDao.readAllData()

    suspend fun addUser(task: Task){
        taskDao.addUser(task)
    }
}
package com.d121201058.aplikasitask.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.d121201058.aplikasitask.data.Task
import com.d121201058.aplikasitask.data.TaskDatabase
import com.d121201058.aplikasitask.data.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaskViewModel(application: Application): AndroidViewModel(application) {

    val readAllData:LiveData<List<Task>>
    private val repository: TaskRepository

    init {
        val userDao = TaskDatabase.getDatabase(application).userDao()
        repository = TaskRepository(userDao)
        readAllData = repository.readAllData

    }

    fun addUser(task: Task){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(task)
        }
    }
}
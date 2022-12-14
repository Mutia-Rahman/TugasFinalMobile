package com.d121201058.aplikasitask.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.d121201058.aplikasitask.data.Task

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(task: Task)

    @Query("SELECT * FROM task_table ORDER BY category ASC")
    fun readAllData():LiveData<List<Task>>
}
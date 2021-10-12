package com.avtocontrol.testcompose.data.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.avtocontrol.testcompose.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}
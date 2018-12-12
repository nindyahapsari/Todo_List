package com.nindyahapsari.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.nindyahapsari.todolist.database.AppDatabase;
import com.nindyahapsari.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {


    private LiveData<TaskEntry> task;

    // Note: The constructor should receive the database and the taskId

    public AddTaskViewModel(AppDatabase database, int taskId){
        task = database.taskDao().loadTaskById(taskId);
    }


    public LiveData<TaskEntry> getTask() {
        return task;
    }
}

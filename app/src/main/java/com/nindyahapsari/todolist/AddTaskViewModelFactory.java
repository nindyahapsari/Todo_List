package com.nindyahapsari.todolist;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.nindyahapsari.todolist.database.AppDatabase;
import com.nindyahapsari.todolist.database.TaskEntry;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {


    private final AppDatabase mDb;
    private final int mTaskId;


    public AddTaskViewModelFactory (AppDatabase database, int taskId) {
        mDb = database;
        mTaskId = taskId;
    }

    // Note: This can be reused with minor modifications
    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }
}

package com.example.newproject;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Note.class, version = 1)
abstract class NoteDataBase extends RoomDatabase {

    private static NoteDataBase instance;
    public abstract Dao dao();

    public static synchronized  NoteDataBase getInstance(Context context){
        if(instance==null) instance= Room.databaseBuilder(context.getApplicationContext()
                ,NoteDataBase.class,"NoteDB")
                .fallbackToDestructiveMigration()
                .build();
        return instance;
    }

}

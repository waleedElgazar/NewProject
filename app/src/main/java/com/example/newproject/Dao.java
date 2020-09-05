package com.example.newproject;

import androidx.room.*;

import java.util.List;

@androidx.room.Dao
interface Dao {

    @Insert
    void insertNote(Note note);

    @Query("select * from Note")
    List<Note> getNotes();
}

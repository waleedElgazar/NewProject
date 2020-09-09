package com.example.newproject;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity()
class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String body;
    private String date;
    private String type;

    public Note(String body, String date, String type) {
        this.body = body;
        this.date = date;
        this.type=type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

}

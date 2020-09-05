package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText name,pass;
    RecyclerView recyclerView;
    MyAdapter MyAdapter;
    ArrayList<Note> models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.re);
        models=new ArrayList<>();
        NoteDataBase noteDataBase=NoteDataBase.getInstance(this);
        for (int i = 0; i < 20; i++) {
            Date date=new Date();
            String x=date.toString();
            Note note=new Note("waleed "+i,x);
            models.add(note);
        }
        MyAdapter =new MyAdapter(models);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(MyAdapter);

    }

}
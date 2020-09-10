package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TimePicker;

public class newNote extends AppCompatActivity {
    String arr[]=new String[]{
      "Health","Sports","Personal","Habit"
    };
    AutoCompleteTextView auto;
    EditText text;
    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        auto=findViewById(R.id.autotext);
        text=findViewById(R.id.body);
        timePicker=findViewById(R.id.timepicker);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,arr);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
    }
    public void saveNote(View v){
        String type, time,body;
        type=auto.getText().toString();
        body=text.getText().toString();

    }
}
package com.example.newproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Adapterr> {
    ArrayList<Note> list = new ArrayList<>();

    public MyAdapter (ArrayList<Note> list){
        this.list=list;
    }

    @NonNull
    @Override
    public Adapterr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Adapterr(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main2, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Adapterr holder, int position) {
        final Note model=list.get(position);
        holder.txt1.setText(model.getType());
        holder.txt2.setText(model.getDate());
        holder.txt3.setText(model.getBody());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Adapterr extends RecyclerView.ViewHolder {
        TextView txt1,txt2,txt3;
        public Adapterr(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.type);
            txt2=itemView.findViewById(R.id.date);
            txt3=itemView.findViewById(R.id.body);
        }
    }
}

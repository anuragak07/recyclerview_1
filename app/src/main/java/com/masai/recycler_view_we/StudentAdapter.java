package com.masai.recycler_view_we;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder > {

    private ArrayList<Student> StudentList;
    public StudentAdapter(ArrayList<Student> StudentList){
        this.StudentList = StudentList;

    }
    @NonNull

    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = StudentList.get(position);
        holder.setData(student);

    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }
}

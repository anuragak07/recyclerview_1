package com.masai.recycler_view_we;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> StudentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildStudentList();
        setRecyclerView();
    }

    private void buildStudentList() {
        Student student1 = new Student("Anurag",24,"emp007");
        Student student2 = new Student("Akash",23,"emp071");
        for(int i =0 ; i<13; i++){
            Student student3 = new Student("xyz",21,"emp125");
        }
    }

    private void setRecyclerView(){
        StudentAdapter studentAdapter =new StudentAdapter(StudentList);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);

    }

    private void initView(){
        recyclerView = findViewById(R.id.recyclerview);
    }
}
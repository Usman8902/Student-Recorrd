package com.example.studentrecord;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList extends AppCompatActivity {
    DbHelper dbHelper;
    List<Student> friendsList;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dbHelper = new DbHelper(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        friendsList = dbHelper.selectAllStudents();
        recyclerView = findViewById(R.id.recyclerview);


        recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        layoutManager = new LinearLayoutManager(StudentList.this);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new StudentRecyclerViewAdapter(friendsList) ;
        recyclerView.setAdapter(adapter);

    }
}

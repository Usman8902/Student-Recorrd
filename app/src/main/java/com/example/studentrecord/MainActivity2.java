package com.example.studentrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MainActivity2 extends AppCompatActivity {

    DbHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        db = new DbHelper(this);

        Button addStudentAction = findViewById(R.id.button4);
        EditText rollNo = findViewById(R.id.editTextText);
        TextView name = findViewById(R.id.editTextText2);
        TextView age = findViewById(R.id.editTextText3);
        addStudentAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameValue, rollNoValue;
                int ageValue = 0;
                rollNoValue = rollNo.getText().toString();
                nameValue = name.getText().toString();
                try {
                    ageValue = Integer.parseInt(age.getText().toString());
                    Student student = new Student(nameValue, rollNoValue, ageValue);
                    db.insertStudent(student);
                }
                catch (SQLiteConstraintException exc){
                    Toast.makeText(MainActivity2.this, "Roll no already taken", Toast.LENGTH_LONG).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity2.this, "Enter right age", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(MainActivity2.this, "Student created successfully", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

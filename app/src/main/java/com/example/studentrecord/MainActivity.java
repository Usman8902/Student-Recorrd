package com.example.studentrecord;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button2);
        btn1=findViewById(R.id.button3);
        btn2=findViewById(R.id.button5);
       btn3 = findViewById(R.id.button6);
       btn4 = findViewById(R.id.button);

        String url = "https://github.com/Usman8902/Student-Recorrd";
        Intent i= new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(MainActivity.this, StudentList.class);
                startActivity(moveActivity);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(MainActivity.this, InsertDailyTask.class);
                startActivity(moveActivity);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(MainActivity.this, ShowTaskActivity.class);
                startActivity(moveActivity);
            }
        });
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                openMainActivity2();

            }

        });

    }

    public void openMainActivity2()
    {
        Intent intent=new Intent(this,MainActivity2.class);

        startActivity(intent);

    }
}

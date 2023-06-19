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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button2);
        btn1=findViewById(R.id.button3);

        String url = "https://github.com/Usman8902/Student-Recorrd";
        Intent i= new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
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

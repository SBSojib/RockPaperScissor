package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextPage();
    }

    private void nextPage() {

        Button button1;
        Button button2;
        TextView textView1;
        button1 = (Button) findViewById(R.id.page1_button1);
        button2 = (Button) findViewById(R.id.page1_button2);
        textView1 = (TextView) findViewById(R.id.page1_textView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Move11.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Move21.class);
                startActivity(intent);
            }
        });
    }
}

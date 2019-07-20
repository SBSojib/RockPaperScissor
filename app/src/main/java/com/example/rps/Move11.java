package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Move11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page12);
        nextPage();
    }

    private void nextPage() {

        Button button1;
        Button button2;
        Button button3;
        button1 = (Button) findViewById(R.id.page12_button1);
        button2 = (Button) findViewById(R.id.page12_button2);
        button3 = (Button) findViewById(R.id.page12_button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Move11.this, Move12.class);
                intent.putExtra("playerMove",0);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Move11.this, Move12.class);
                intent.putExtra("playerMove",1);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Move11.this, Move12.class);
                intent.putExtra("playerMove",2);
                startActivity(intent);
            }
        });
    }
}

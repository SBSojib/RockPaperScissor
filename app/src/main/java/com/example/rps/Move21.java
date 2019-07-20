package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Move21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page22);
        nextPage();
    }

    private void nextPage() {

        Button button1;
        Button button2;
        Button button3;
        button1 = (Button) findViewById(R.id.page22_button1);
        button2 = (Button) findViewById(R.id.page22_button2);
        button3 = (Button) findViewById(R.id.page22_button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Move21.this, Move22.class);
                intent.putExtra("player1Move",0);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Move21.this, Move22.class);
                intent.putExtra("player1Move",1);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Move21.this, Move22.class);
                intent.putExtra("player1Move",2);
                startActivity(intent);
            }
        });
    }
}

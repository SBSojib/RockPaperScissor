package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Move22 extends AppCompatActivity {

    int player1Move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page23);

        Intent intent = this.getIntent();
        player1Move = intent.getIntExtra("player1Move",1);
        nextPage();
    }
    private void nextPage() {

        Button button1;
        Button button2;
        Button button3;
        button1 = (Button) findViewById(R.id.page23_button1);
        button2 = (Button) findViewById(R.id.page23_button2);
        button3 = (Button) findViewById(R.id.page23_button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int winner = 0;
                if(player1Move == 0) winner = 0;
                if(player1Move == 1) winner = 1;
                if(player1Move == 2) winner = 2;
                Intent intent = new Intent(Move22.this, Move23.class);
                intent.putExtra("winner",winner);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int winner = 0;
                if(player1Move == 0) winner = 2;
                if(player1Move == 1) winner = 0;
                if(player1Move == 2) winner = 1;
                Intent intent = new Intent(Move22.this, Move23.class);
                intent.putExtra("winner",winner);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int winner = 0;
                if(player1Move == 0) winner = 1;
                if(player1Move == 1) winner = 2;
                if(player1Move == 2) winner = 0;
                Intent intent = new Intent(Move22.this, Move23.class);
                intent.putExtra("winner",winner);
                startActivity(intent);
            }
        });
    }
}

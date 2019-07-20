package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Move23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page13);

        Intent intent = this.getIntent();
        int winner = intent.getIntExtra("winner",1);
        TextView textView = (TextView) findViewById(R.id.page13_textView);
        textView.setTextSize(50);

        nextPage();

        if(winner == 0) {
            textView.setText("It's a Draw");
        }
        else if(winner == 1) {
            textView.setText("Player 1 Wins");
        }
        else if(winner == 2) {
            textView.setText(("Player 2 Wins"));
        }
    }
    private void nextPage() {

        Button button = (Button) findViewById(R.id.page13_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Move23.this, Move21.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Move12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page13);

        Intent intent = this.getIntent();
        int playerMove = intent.getIntExtra("playerMove",1);
        TextView textView = (TextView) findViewById(R.id.page13_textView);
        TextView textView2 = (TextView) findViewById(R.id.page13_textView2);

        nextPage();

        Random random = new Random();
        int computerMove = random.nextInt();
        computerMove%=3;
        if(computerMove<0) computerMove*=-1;

        if(computerMove == 0) textView2.setText("Computers move is Rock");
        if(computerMove == 1) textView2.setText("Computers move is Paper");
        if(computerMove == 2) textView2.setText("Computers move is Scissor");

        System.out.println("............................................................."+computerMove);
        if(computerMove == 0) {
            if(playerMove == 0) {
                textView.setText("It's a Draw");
            }
            if(playerMove == 1) {
                textView.setText("You Win");
            }
            if(playerMove == 2) {
                textView.setText("You Loose");
            }
        }
        if(computerMove == 1) {
            if(playerMove == 0) {
                textView.setText("You Loose");
            }
            if(playerMove == 1) {
                textView.setText("It's a Draw");
            }
            if(playerMove == 2) {
                textView.setText("You Win");
            }
        }
        if(computerMove == 2) {
            if(playerMove == 0) {
                textView.setText("You Win");
            }
            if(playerMove == 1) {
                textView.setText("You Loose");
            }
            if(playerMove == 2) {
                textView.setText("You Draw");
            }
        }
    }
    private void nextPage() {

        Button button = (Button) findViewById(R.id.page13_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Move12.this, Move11.class);
                startActivity(intent);
            }
        });
    }
}

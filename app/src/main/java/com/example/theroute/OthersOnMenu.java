package com.example.theroute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OthersOnMenu extends AppCompatActivity {
    TextView calculator,more,Tictactoe,snake,more2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_on_menu);
        calculator=findViewById(R.id.calcFeature);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OthersOnMenu.this, "Opening calculator", Toast.LENGTH_SHORT).show();
            }
        });
        more=findViewById(R.id.featureMore);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OthersOnMenu.this, "Currently Unavailable", Toast.LENGTH_SHORT).show();
            }
        });
        snake=findViewById(R.id.snakeGame);
        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OthersOnMenu.this, "Opening snake Game", Toast.LENGTH_SHORT).show();
            }
        });
        Tictactoe=findViewById(R.id.tictactoeGame);
        Tictactoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OthersOnMenu.this, "Opening Tic-Tac-Toe", Toast.LENGTH_SHORT).show();
            }
        });
        more2=findViewById(R.id.moreGame);
        more2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OthersOnMenu.this, "More games to add", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
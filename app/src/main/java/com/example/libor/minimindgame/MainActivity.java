package com.example.libor.minimindgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPlay, btnOptions, btnExit, btnCredits;
    Intent game,option;

    int randomize = 2; int clues = 1; int stages = 4; int object = 4; int circledesign = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Intent(MainActivity.this, mastermind.class);
        option = new Intent(MainActivity.this, options.class);
        btnPlay = (ImageButton)findViewById(R.id.btnPlay);
        btnOptions = (ImageButton)findViewById(R.id.btnOptions);
        btnExit = (ImageButton)findViewById(R.id.btnExit);
        btnCredits = (ImageButton)findViewById(R.id.btnCredits);
        btnPlay();
        btnOptions();
    }
    private void btnPlay()
    {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game.putExtra("random",randomize);
                game.putExtra("clues", clues);
                game.putExtra("stages", stages);
                game.putExtra("objects", object);
                game.putExtra("circle", circledesign);
                startActivity(game);
            }
        });
    }
    private void btnOptions()
    {
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(option);
            }
        });
    }
}

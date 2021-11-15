package com.example.libor.minimindgame;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class mastermind extends AppCompatActivity {
    int obj, stg, diff, clue, design, row, choice;
    int bot1, bot2, bot3, bot4, bot5;
    int tries = 1;
    int slot = 1;
    int player1, player2, player3, player4, player5;
    ImageButton avatar1;
    ImageView Column1dot1, Column1dot2, Column1dot3, Column1dot4, Column1dot5, Column1dot6;
    ImageView Column2dot1, Column2dot2, Column2dot3, Column2dot4, Column2dot5, Column2dot6;
    ImageView Column3dot1, Column3dot2, Column3dot3, Column3dot4, Column3dot5, Column3dot6;
    ImageView Column4dot1, Column4dot2, Column4dot3, Column4dot4, Column4dot5, Column4dot6;
    ImageView Column5dot1, Column5dot2, Column5dot3, Column5dot4, Column5dot5, Column5dot6;
    ImageView try6, try5;
    ImageButton choice1, choice2, choice3, choice4, choice5,choice6, reveal1, reveal2, reveal3, reveal4, reveal5, surrenderbtn, playagainbtn;
    int pictureset[][] = {{R.drawable.horror1,R.drawable.horror1, R.drawable.horror2, R.drawable.horror3, R.drawable.horror4, R.drawable.horror5, R.drawable.horror6},
            {}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mastermind);

        try6 = (ImageView)findViewById(R.id.try6);
        try5 = (ImageView)findViewById(R.id.try5);

        Column1dot1 = (ImageView) findViewById(R.id.Column1dot1);
        Column1dot2 = (ImageView) findViewById(R.id.Column1dot2);
        Column1dot3 = (ImageView) findViewById(R.id.Column1dot3);
        Column1dot4 = (ImageView) findViewById(R.id.Column1dot4);
        Column1dot5 = (ImageView) findViewById(R.id.Column1dot5);
        Column1dot6 = (ImageView) findViewById(R.id.Column1dot6);

        Column2dot1 = (ImageView) findViewById(R.id.Column2dot1);
        Column2dot2 = (ImageView) findViewById(R.id.Column2dot2);
        Column2dot3 = (ImageView) findViewById(R.id.Column2dot3);
        Column2dot4 = (ImageView) findViewById(R.id.Column2dot4);
        Column2dot5 = (ImageView) findViewById(R.id.Column2dot5);
        Column2dot6 = (ImageView) findViewById(R.id.Column2dot6);

        Column3dot1 = (ImageView) findViewById(R.id.Column3dot1);
        Column3dot2 = (ImageView) findViewById(R.id.Column3dot2);
        Column3dot3 = (ImageView) findViewById(R.id.Column3dot3);
        Column3dot4 = (ImageView) findViewById(R.id.Column3dot4);
        Column3dot5 = (ImageView) findViewById(R.id.Column3dot5);
        Column3dot6 = (ImageView) findViewById(R.id.Column3dot6);

        Column4dot1 = (ImageView) findViewById(R.id.Column4dot1);
        Column4dot2 = (ImageView) findViewById(R.id.Column4dot2);
        Column4dot3 = (ImageView) findViewById(R.id.Column4dot3);
        Column4dot4 = (ImageView) findViewById(R.id.Column4dot4);
        Column4dot5 = (ImageView) findViewById(R.id.Column4dot5);
        Column4dot6 = (ImageView) findViewById(R.id.Column4dot6);

        Column5dot1 = (ImageView) findViewById(R.id.Column5dot1);
        Column5dot2 = (ImageView) findViewById(R.id.Column5dot2);
        Column5dot3 = (ImageView) findViewById(R.id.Column5dot3);
        Column5dot4 = (ImageView) findViewById(R.id.Column5dot4);
        Column5dot5 = (ImageView) findViewById(R.id.Column5dot5);
        Column5dot6 = (ImageView) findViewById(R.id.Column5dot6);

        choice1 = (ImageButton)findViewById(R.id.btn1);
        choice2 = (ImageButton)findViewById(R.id.btn2);
        choice3 = (ImageButton)findViewById(R.id.btn3);
        choice4 = (ImageButton)findViewById(R.id.btn4);
        choice5 = (ImageButton)findViewById(R.id.btn5);
        choice6 = (ImageButton)findViewById(R.id.btn6);

        reveal1 = (ImageButton)findViewById(R.id.Genbtn1);
        reveal2 = (ImageButton)findViewById(R.id.Genbtn2);
        reveal3 = (ImageButton)findViewById(R.id.Genbtn3);
        reveal4 = (ImageButton)findViewById(R.id.Genbtn4);
        reveal5 = (ImageButton)findViewById(R.id.Genbtn5);
        playagainbtn = (ImageButton)findViewById(R.id.btnPlayAgain);
        surrenderbtn = (ImageButton)findViewById(R.id.BtnSurrender);
        newGame();
    }
    public void newGame(){
        obj = getIntent().getIntExtra("objects", 4);
        clue = getIntent().getIntExtra("clues", 1);
        diff = getIntent().getIntExtra("random", 2);
        stg = getIntent().getIntExtra("stages", 4);
        design = getIntent().getIntExtra("circle", 0);
        choice1.setClickable(true);
        choice2.setClickable(true);
        choice3.setClickable(true);
        choice4.setClickable(true);
        choice5.setClickable(true);
        reveal1.setImageResource(R.drawable.question);
        reveal2.setImageResource(R.drawable.question);
        reveal3.setImageResource(R.drawable.question);
        reveal4.setImageResource(R.drawable.question);
        reveal5.setImageResource(R.drawable.question);
        Column1dot1.setImageResource(R.drawable.dot);
        Column1dot2.setImageResource(R.drawable.dot);
        Column1dot3.setImageResource(R.drawable.dot);
        Column1dot4.setImageResource(R.drawable.dot);
        Column1dot5.setImageResource(R.drawable.dot);
        Column1dot6.setImageResource(R.drawable.dot);

        Column2dot1.setImageResource(R.drawable.dot);
        Column2dot2.setImageResource(R.drawable.dot);
        Column2dot3.setImageResource(R.drawable.dot);
        Column2dot4.setImageResource(R.drawable.dot);
        Column2dot5.setImageResource(R.drawable.dot);
        Column2dot6.setImageResource(R.drawable.dot);

        Column3dot1.setImageResource(R.drawable.dot);
        Column3dot2.setImageResource(R.drawable.dot);
        Column3dot3.setImageResource(R.drawable.dot);
        Column3dot4.setImageResource(R.drawable.dot);
        Column3dot5.setImageResource(R.drawable.dot);
        Column3dot6.setImageResource(R.drawable.dot);

        Column4dot1.setImageResource(R.drawable.dot);
        Column4dot2.setImageResource(R.drawable.dot);
        Column4dot3.setImageResource(R.drawable.dot);
        Column4dot4.setImageResource(R.drawable.dot);
        Column4dot5.setImageResource(R.drawable.dot);
        Column4dot6.setImageResource(R.drawable.dot);

        Column5dot1.setImageResource(R.drawable.dot);
        Column5dot2.setImageResource(R.drawable.dot);
        Column5dot3.setImageResource(R.drawable.dot);
        Column5dot4.setImageResource(R.drawable.dot);
        Column5dot5.setImageResource(R.drawable.dot);
        Column5dot6.setImageResource(R.drawable.dot);
        playagainbtn.setAlpha(0);
        checkObj();
        checkstg();
        Randomize();
        tries = 1;
        row = 1;
        slot = 1;
        Guess();
        surrenderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mastermind.this);
                builder.setTitle("You Surrendered!");
                builder.setMessage("Perhaps, it was too hard for you!");
                builder.setNegativeButton("Continue", null);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                reveal1.setImageResource(pictureset[design][bot1]);
                reveal2.setImageResource(pictureset[design][bot2]);
                reveal3.setImageResource(pictureset[design][bot3]);
                reveal4.setImageResource(pictureset[design][bot4]);
                reveal5.setImageResource(pictureset[design][bot5]);
                choice1.setClickable(false);
                choice2.setClickable(false);
                choice3.setClickable(false);
                choice4.setClickable(false);
                choice5.setClickable(false);
                playagainbtn.setAlpha(255);
                playagainbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        newGame();
                    }
                });
            }
        });


    }
    public void Guess(){
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = 1;
                rowsandstages();
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = 2;
                rowsandstages();
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = 3;
                rowsandstages();
            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = 4;
                rowsandstages();
            }
        });

        choice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = 5;
                rowsandstages();
            }
        });

        choice6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice = 6;
                rowsandstages();
            }
        });
    }
    public void Check(){
            if(player1 == bot1 && player2 == bot2 && player3 == bot3 && player4 == bot4){
                AlertDialog.Builder builder = new AlertDialog.Builder(mastermind.this);
                builder.setTitle("You Won!");
                builder.setMessage("You guessed Correctly!");
                builder.setNegativeButton("Continue", null);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                reveal1.setImageResource(pictureset[design][bot1]);
                reveal2.setImageResource(pictureset[design][bot2]);
                reveal3.setImageResource(pictureset[design][bot3]);
                reveal4.setImageResource(pictureset[design][bot4]);
                reveal5.setImageResource(pictureset[design][bot5]);
                choice1.setClickable(false);
                choice2.setClickable(false);
                choice3.setClickable(false);
                choice4.setClickable(false);
                choice5.setClickable(false);
                playagainbtn.setAlpha(255);
                playagainbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        newGame();
                    }
                });

            }
            else {
                slot = 1;
                row ++;
                if(tries != stg) {
                    Toast.makeText(getApplicationContext(), "Try Again!", Toast.LENGTH_LONG).show();
                    tries++;
                    Guess();
                }
                else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(mastermind.this);
                    builder.setTitle("You Lost!");
                    builder.setMessage("You guessed wrong!");
                    builder.setNegativeButton("Continue", null);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    reveal1.setImageResource(pictureset[design][bot1]);
                    reveal2.setImageResource(pictureset[design][bot2]);
                    reveal3.setImageResource(pictureset[design][bot3]);
                    reveal4.setImageResource(pictureset[design][bot4]);
                    reveal5.setImageResource(pictureset[design][bot5]);
                    choice1.setClickable(false);
                    choice2.setClickable(false);
                    choice3.setClickable(false);
                    choice4.setClickable(false);
                    choice5.setClickable(false);
                    playagainbtn.setAlpha(255);
                    playagainbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            newGame();
                        }
                    });

                }
            }
        }
    public void rowsandstages(){
            if (row == 1){
                    switch (slot) {
                        case 1:
                            player1 = choice;
                            Column1dot1.setImageResource(pictureset[design][choice]);
                            slot++;
                            break;
                        case 2:
                            player2 = choice;
                            Column2dot1.setImageResource(pictureset[design][choice]);
                            slot++;
                            break;
                        case 3:
                            player3 = choice;
                            Column3dot1.setImageResource(pictureset[design][choice]);
                            slot++;
                            break;
                        case 4:
                            player4 = choice;
                            Column4dot1.setImageResource(pictureset[design][choice]);
                            if(obj == 4) {
                                player5 = bot5;
                                Check();
                            }
                            else{
                                slot++;
                            }
                            break;
                        case 5:
                            player5 = choice;
                            Column5dot1.setImageResource(pictureset[design][choice]);
                            Check();
                            break;
                    }
            }
            else if (row == 2){
                switch (slot) {
                    case 1:
                        player1 = choice;
                        Column1dot2.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 2:
                        player2 = choice;
                        Column2dot2.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 3:
                        player3 = choice;
                        Column3dot2.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 4:
                        player4 = choice;
                        Column4dot2.setImageResource(pictureset[design][choice]);
                        if(obj == 4) {
                            player5 = bot5;
                            Check();
                        }
                        else{
                            slot++;
                        }
                        break;
                    case 5:
                        player5 = choice;
                        Column5dot2.setImageResource(pictureset[design][choice]);
                        Check();
                        break;
                }
            }
            else if (row == 3){
                switch (slot) {
                    case 1:
                        player1 = choice;
                        Column1dot3.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 2:
                        player2 = choice;
                        Column2dot3.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 3:
                        player3 = choice;
                        Column3dot3.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 4:
                        player4 = choice;
                        Column4dot3.setImageResource(pictureset[design][choice]);
                        if(obj == 4) {
                            player5 = bot5;
                            Check();
                        }
                        else{
                            slot++;
                        }
                        break;
                    case 5:
                        player5 = choice;
                        Column5dot3.setImageResource(pictureset[design][choice]);
                        Check();
                        break;
                }

            }
            else if (row == 4){
                switch (slot) {
                    case 1:
                        player1 = choice;
                        Column1dot4.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 2:
                        player2 = choice;
                        Column2dot4.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 3:
                        player3 = choice;
                        Column3dot4.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 4:
                        player4 = choice;
                        Column4dot4.setImageResource(pictureset[design][choice]);
                        if(obj == 4) {
                            player5 = bot5;
                            Check();
                        }
                        else{
                            slot++;
                        }
                        break;
                    case 5:
                        player5 = choice;
                        Column5dot4.setImageResource(pictureset[design][choice]);
                        Check();
                        break;
                }

            }
            else if (row == 5){
                switch (slot) {
                    case 1:
                        player1 = choice;
                        Column1dot5.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 2:
                        player2 = choice;
                        Column2dot5.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 3:
                        player3 = choice;
                        Column3dot5.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 4:
                        player4 = choice;
                        Column4dot5.setImageResource(pictureset[design][choice]);
                        if(obj == 4) {
                            player5 = bot5;
                            Check();
                        }
                        else{
                            slot++;
                        }
                        break;
                    case 5:
                        player5 = choice;
                        Column5dot5.setImageResource(pictureset[design][choice]);
                        Check();
                        break;
                }

            }
            else if (row == 6){
                switch (slot) {
                    case 1:
                        player1 = choice;
                        Column1dot6.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 2:
                        player2 = choice;
                        Column2dot6.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 3:
                        player3 = choice;
                        Column3dot6.setImageResource(pictureset[design][choice]);
                        slot++;
                        break;
                    case 4:
                        player4 = choice;
                        Column4dot6.setImageResource(pictureset[design][choice]);
                        if(obj == 4) {
                            player5 = bot5;
                            Check();
                        }
                        else{
                            slot++;
                        }
                        break;
                    case 5:
                        player5 = choice;
                        Column5dot6.setImageResource(pictureset[design][choice]);
                        Check();
                        break;
                }

            }

    }
    public void checkstg(){
        if(stg == 4){
            Column1dot6.setAlpha(0);
            Column2dot6.setAlpha(0);
            Column3dot6.setAlpha(0);
            Column4dot6.setAlpha(0);
            Column5dot6.setAlpha(0);
            try6.setAlpha(0);

            Column1dot5.setAlpha(0);
            Column2dot5.setAlpha(0);
            Column3dot5.setAlpha(0);
            Column4dot5.setAlpha(0);
            Column5dot5.setAlpha(0);
            try5.setAlpha(0);

        }
        else if (stg == 5){
            Column1dot6.setAlpha(0);
            Column2dot6.setAlpha(0);
            Column3dot6.setAlpha(0);
            Column4dot6.setAlpha(0);
            Column5dot6.setAlpha(0);
            try6.setAlpha(0);

            Column1dot5.setAlpha(255);
            Column2dot5.setAlpha(255);
            Column3dot5.setAlpha(255);
            Column4dot5.setAlpha(255);
            Column5dot5.setAlpha(255);
            try5.setAlpha(255);

        }
        else{
            Column1dot6.setAlpha(255);
            Column2dot6.setAlpha(255);
            Column3dot6.setAlpha(255);
            Column4dot6.setAlpha(255);
            Column5dot6.setAlpha(255);
            try6.setAlpha(255);

            Column1dot5.setAlpha(255);
            Column2dot5.setAlpha(255);
            Column3dot5.setAlpha(255);
            Column4dot5.setAlpha(255);
            Column5dot5.setAlpha(255);
            try5.setAlpha(255);

        }
    }

    public void checkObj(){
        if(obj == 4){
            Column5dot1.setAlpha(0);
            Column5dot2.setAlpha(0);
            Column5dot3.setAlpha(0);
            Column5dot4.setAlpha(0);
            Column5dot5.setAlpha(0);
            Column5dot6.setAlpha(0);
            reveal5.setAlpha(0);
        }
        else{
            Column5dot1.setAlpha(0);
            Column5dot2.setAlpha(0);
            Column5dot3.setAlpha(0);
            Column5dot4.setAlpha(0);
            Column5dot5.setAlpha(0);
            Column5dot6.setAlpha(0);
            reveal5.setAlpha(0);

        }
    }

    public void Randomize(){
        if(diff == 1){
            bot1 =(int) Math.random() * 6;
            bot2 =(int) Math.random() * 6;
            bot3 =(int) Math.random() * 6;
            bot4 =(int) Math.random() * 6;
            bot5 =(int) Math.random() * 6;
        }
        else if (diff == 2){
            ArrayList list = new ArrayList();
            int array[] = new int[5];
            for (int i=0; i < 6; i++){
                list.add(i+1);
            }
            Collections.shuffle(list);
            for(int a = 0; a < 5;a ++){
                array[a] = (int) list.get(a);
            }
            bot1 = array[0];
            bot2 = array[1];
            bot3 = array[2];
            bot4 = array[3];
            bot5 = array[4];

            Toast.makeText(getApplicationContext(),bot1 + " "  + bot2 + " "+ bot3 + " " + bot4 + " " +bot5, Toast.LENGTH_SHORT).show();
        }
        else{
            diff = (int) Math.random() * 2;
            Randomize();
        }
    }

}

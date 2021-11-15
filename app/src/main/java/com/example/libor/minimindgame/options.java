package com.example.libor.minimindgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;

public class options extends AppCompatActivity {
    Spinner spinObject, spinStage;
    ImageButton back;
    int getObject, getStage;
    Intent menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        menu = new Intent(options.this, MainActivity.class);
        spinObject = (Spinner)findViewById(R.id.object);
        spinStage = (Spinner)findViewById(R.id.stage);
        back = (ImageButton)findViewById(R.id.btnBack);
        spinObject();
        spinStage();
        back();
    }
    private void back()
    {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.putExtra("getObject", getObject);
                menu.putExtra("getStage", getStage);
                startActivity(menu);
            }
        });
    }
    private void spinObject()
    {
        spinObject.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                getObject = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    private void spinStage()
    {
        spinStage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                getStage = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Workout extends AppCompatActivity {
    private Button toBench;
    private Button toTricepDips;
    private Button toArnoldPress;
    private Button toHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        toBench = (Button) findViewById(R.id.toBench);
        toBench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBench();
            }
        });

        toArnoldPress = (Button) findViewById(R.id.toArnoldPress);
        toArnoldPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArnoldPress();
            }
        });

        toTricepDips = (Button) findViewById(R.id.toTricepDips);
        toTricepDips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTricepDips();
            }
        });

        toHome = (Button) findViewById(R.id.toHome);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }
    public void openBench(){
        Intent intent = new Intent(this, Bench.class);
        startActivity(intent);
    }
    public void openArnoldPress(){
        Intent intent = new Intent(this, ArnoldPress.class);
        startActivity(intent);
    }

    public void openTricepDips(){
        Intent intent = new Intent(this, TricepDips.class);
        startActivity(intent);
    }

    public void openHome(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
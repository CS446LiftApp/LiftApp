package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button toWorkout;
    private Button toProfile;
    private Button toCustomWorkout;
    private Button toPlanner;
    private Button toGlossary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // view profile button
        toProfile = (Button) findViewById(R.id.toProfile);
        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

        // customize workout button
        toCustomWorkout = (Button) findViewById(R.id.customize);
        toCustomWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCustomWorkout();
            }
        });

        // start workout button
        toWorkout = (Button) findViewById(R.id.toWorkout);
        toWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorkout();
            }
        });

        // bottom bar navigation buttons
        // planner
        toPlanner = (Button) findViewById(R.id.planner_button);
        toPlanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openPlanner(); }
        });

        // glossary
        toGlossary = (Button) findViewById(R.id.glossary_button);
        toGlossary.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { openGlossary(); }
        });
    }

    // navigation methods
    public void openWorkout(){
        Intent intent = new Intent(this, Workout.class);
        startActivity(intent);
    }
    public void openProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void openCustomWorkout() {
        // TODO
        Intent intent = new Intent(this, Custom.class);
        startActivity(intent);
    }

    public void openPlanner() {
        Intent intent = new Intent(this, Planner.class);
        startActivity(intent);
    }

    public void openGlossary() {
        // TODO
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
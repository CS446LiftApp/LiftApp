package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choice extends AppCompatActivity {
    private Button toHome;
    private Button toPlanner;
    private Button toGlossary;
    private Button legs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        // scenario task: select 'legs'
        legs = (Button) findViewById(R.id.Legs);
        legs.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { openPostTaskPlanner(); }
        });

        // bottom bar navigation buttons
        // home
        toHome = (Button) findViewById(R.id.home_button);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });

        // planner
        toPlanner = (Button) findViewById(R.id.planner_button);
        toPlanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPlanner();
            }
        });

        // glossary
        toGlossary = (Button) findViewById(R.id.glossary_button);
        toGlossary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openGlossary(); }
        });
    }

    // navigation methods
    public void openHome(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPlanner() {
        Intent intent = new Intent(this, Planner.class);
        startActivity(intent);
    }

    public void openGlossary() {
        Intent intent = new Intent(this, Glossary.class);
        startActivity(intent);
    }

    public void openPostTaskPlanner() {
        Intent intent = new Intent(this, PlannerPostTask.class);
        startActivity(intent);
    }
}

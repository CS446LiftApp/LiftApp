package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomAddFirst extends AppCompatActivity {

    private Button toHome;
    private Button toPlanner;
    private Button toGlossary;
    private Button toNextPage;
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_add_first);

        toNextPage = (Button) findViewById(R.id.next_button);
        toNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPageTwo();
            }
        });

        // done button
        done = (Button) findViewById(R.id.done_button);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
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

    public void openPageTwo() {
        Intent intent = new Intent(this, CustomAddFirstPageTwo.class);
        startActivity(intent);
    }
}
package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView;

import java.util.Arrays;
import java.util.List;

public class Custom extends AppCompatActivity {
    private Button toHome;
    private Button toPlanner;
    private Button toGlossary;
    private Button done;
    int currentSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        final List<String> exercises = Arrays.asList("+", "Arnold Press", "Back Extension", "Back Squat", "Bench Press", "Biceps Curl", "Chest Flys", "Crunches", "Deadlift", "Lateral Raise", "Leg Curls", "Leg Press", "Lunge", "Military Press", "Pull-Downs", "Pull-Ups", "Push-Downs", "Push-Ups", "Shoulder Press", "Triceps Dips");
        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.spinner, exercises);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner.setAdapter(adapter);

        currentSelection = spinner.getSelectedItemPosition();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
               if (currentSelection != i) { addedItem(); }
               currentSelection = i;
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {
               // do nothing
           }
        });

        // done button
        done = (Button) findViewById(R.id.done_button);
        done.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { openHome(); }
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

    public void addedItem() {
        Intent intent = new Intent(this, CustomAddFirst.class);
        startActivity(intent);
    }
}

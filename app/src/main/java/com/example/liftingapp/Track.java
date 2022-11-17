package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Track extends AppCompatActivity {
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        done = (Button) findViewById(R.id.track4);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorkout();
            }
        });
    }
    public void openWorkout(){
        Intent intent = new Intent(this, Workout.class);
        startActivity(intent);
    }
}
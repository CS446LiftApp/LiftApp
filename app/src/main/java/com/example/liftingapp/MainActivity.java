package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button toProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.toWorkout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorkout();
            }
        });
        toProfile = (Button) findViewById(R.id.toProfile);
        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

    }
    public void openWorkout(){
        Intent intent = new Intent(this, Workout.class);
        startActivity(intent);
    }
    public void openProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TricepDips extends AppCompatActivity {
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep_dips);

        done = (Button) findViewById(R.id.track3);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTracker();
            }
        });
    }
    public void openTracker(){
        Intent intent = new Intent(this, Track.class);
        startActivity(intent);
    }
}
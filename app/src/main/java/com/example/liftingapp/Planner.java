package com.example.liftingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class Planner extends AppCompatActivity {

    private Button toHome;
    private Button toGlossary;
    //private Button choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);


        final List<String> exercise = Arrays.asList(".....","Pull","Push","Legs","Rest", "Custom1");
        Spinner spinner = findViewById(R.id.spinner1);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);
        Spinner spinner3 = findViewById(R.id.spinner3);
        Spinner spinner4 = findViewById(R.id.spinner4);
        Spinner spinner5 = findViewById(R.id.spinner5);
        Spinner spinner6 = findViewById(R.id.spinner6);

        //spinner = findViewById(R.id.spinner1);
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.spinner,exercise);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);

        /*
        choice=findViewById(R.id.tues);
        choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Planner.this, Choice.class);
                startActivity(intent);
            }
        });*/

        // bottom bar navigation buttons
        // home
        toHome = (Button) findViewById(R.id.home_button);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
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

    public void openGlossary() {
        Intent intent = new Intent(this, Glossary.class);
        startActivity(intent);
    }

}

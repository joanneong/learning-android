package com.example.crickettemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String DESCRIPTION = "Did you know you can determine the temperature " +
        "outside by counting the number of chirps the cricket makes? Just count the number of " +
        "chirps one makes in 25 seconds and place that number in the box below:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
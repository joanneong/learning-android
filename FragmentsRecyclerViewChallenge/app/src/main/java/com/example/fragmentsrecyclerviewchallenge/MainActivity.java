package com.example.fragmentsrecyclerviewchallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCarInfo, btnOwnerInfo;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = this.getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .hide(fragmentManager.findFragmentById(R.id.carInfoFrag))
                .show(fragmentManager.findFragmentById(R.id.ownerInfoFrag))
                .commit();

        btnCarInfo = findViewById(R.id.btnCarInfo);
        btnOwnerInfo = findViewById(R.id.btnOwnerInfo);

        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .hide(fragmentManager.findFragmentById(R.id.ownerInfoFrag))
                        .show(fragmentManager.findFragmentById(R.id.carInfoFrag))
                        .commit();
            }
        });

        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .hide(fragmentManager.findFragmentById(R.id.carInfoFrag))
                        .show(fragmentManager.findFragmentById(R.id.ownerInfoFrag))
                        .commit();
            }
        });


    }
}
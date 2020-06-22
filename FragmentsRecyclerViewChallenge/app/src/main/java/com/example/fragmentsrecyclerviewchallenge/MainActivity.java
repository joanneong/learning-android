package com.example.fragmentsrecyclerviewchallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarAdapter.ItemClicked {

    Button btnCarInfo, btnOwnerInfo;
    TextView tvOwnerInfo, tvOwnerTel;

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
        tvOwnerInfo = findViewById(R.id.tvOwnerInfo);
        tvOwnerTel = findViewById(R.id.tvOwnerTel);

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

    @Override
    public void onItemClicked(int index) {
        tvOwnerInfo.setText(ApplicationClass.cars.get(index).getOwner());
        tvOwnerTel.setText(ApplicationClass.cars.get(index).getOwnerTel());
    }
}
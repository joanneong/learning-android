package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvProducts;
    ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProducts = findViewById(R.id.lvProducts);

        list = new ArrayList<Product>();
        Product product1 = new Product("Dell Latitude 3500",
                "The world's best laptop", "Laptop", 14500.00, true);
        Product product2 = new Product("Acer Latitude 3500",
                "The world's worst Hdd", "Hdd", 1990.00, false);
        Product product3 = new Product("Apple Macbook Pro",
                "Amazing memory", "Memory", 100.90, true);
        Product product4 = new Product("Windows Vista",
                "The world's best screen", "Screen", 999.95, false);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        ProductAdapter adapter = new ProductAdapter(this, list);
        lvProducts.setAdapter(adapter);
    }
}
package com.example.fragmentsrecyclerviewchallenge;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
   public static ArrayList<Car> cars;

    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<>();
        cars.add(new Car("Volkswagen", "Polo", "Chuck Norris",
                "6546746894"));
        cars.add(new Car("Mercedes", "E200", "Peter Pollock",
                "761784"));
        cars.add(new Car("Nissan", "Almera", "Chris James",
                "716888781487"));
        cars.add(new Car("Mercedes", "E180", "John Rambo",
                "4589178741"));
        cars.add(new Car("Volkswagen", "Alexia", "Alice Purple",
                "80691789"));
        cars.add(new Car("Nissan", "Almera", "Chris James",
                "716888781487"));
        cars.add(new Car("Mercedes", "E180", "John Rambo",
                "4589178741"));
        cars.add(new Car("Volkswagen", "Alexia", "Alice Purple",
                "80691789"));
    }
}

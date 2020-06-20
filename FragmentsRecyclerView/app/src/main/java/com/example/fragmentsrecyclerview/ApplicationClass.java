package com.example.fragmentsrecyclerview;

import android.app.Application;

import java.util.ArrayList;

/**
 * Runs before and after the main activity starts and ends
 */
public class ApplicationClass extends Application {
    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<>();
        people.add(new Person("Chuck Norris", "23699641"));
        people.add(new Person("John Rambo", "47474684"));
        people.add(new Person("Nelson Mandela", "87468754"));
    }
}

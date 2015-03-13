package com.example.android.parseapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import dataaccess.FoodItem;

/**
 * Created by Android on 3/13/2015.
 */
public class Global extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(FoodItem.class);
        Parse.initialize(this, "XkS843rZYvQp2YQKDPg0WmhG6Tm4WAuBwv6EQpiz", "MaTeXi4fAvFS2ZmhA0gzNN4W7tN172GMXeDxyaWC");

    }
}
